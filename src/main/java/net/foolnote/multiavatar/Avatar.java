package net.foolnote.multiavatar;

import net.foolnote.multiavatar.constant.Constants;
import net.foolnote.multiavatar.constant.Part;
import net.foolnote.multiavatar.constant.ShapeV;
import net.foolnote.multiavatar.constant.ThemeV;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 头像生成工具类
 *
 * @author marlon
 */
public class Avatar {

    private final static String CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLLMNOPQRESUVWXYZ";

    /**
     * 正则，用于匹配 svg 字符串中的颜色
     */
    private static final Pattern pattern = Pattern.compile("#(.*?)+(?=;)");

    /**
     * 根据 avatarId 生成头像
     *
     * @param avatarId 头像 id
     * @return 头像 | svg 字符串
     * @throws NoSuchAlgorithmException     NoSuchAlgorithmException
     */
    public static String generate(String avatarId) throws NoSuchAlgorithmException {
        return generate(avatarId, false, null);
    }

    /**
     * 根据 avatarId 生成头像
     *
     * @param avatarId 头像 id
     * @param sansEnv  是否无背景
     * @return 头像 | svg 字符串
     * @throws NoSuchAlgorithmException     NoSuchAlgorithmException
     */
    public static String generate(String avatarId, boolean sansEnv) throws NoSuchAlgorithmException {
        return generate(avatarId, sansEnv, null);
    }

    /**
     * 随机生成头像
     *
     * @return 头像 | svg 字符串
     * @throws NoSuchAlgorithmException     NoSuchAlgorithmException
     */
    public static String generate() throws NoSuchAlgorithmException {
        return generate(randomStr(1, 20));
    }

    /**
     * 随机生成头像
     * @param sansEnv 是否无背景
     * @return 头像 | svg 字符串
     * @throws NoSuchAlgorithmException     NoSuchAlgorithmException
     */
    public static String generate(boolean sansEnv) throws NoSuchAlgorithmException {
        return generate(randomStr(1, 20), sansEnv);
    }

    /**
     * 根据 avatarId 生成头像
     *
     * @param avatarId 头像 id
     * @param sansEnv  是否无背景
     * @param ver      指定的主题样式
     * @return 头像 | svg 字符串
     * @throws NoSuchAlgorithmException     NoSuchAlgorithmException
     */
    public static String generate(String avatarId, boolean sansEnv, Map<String, String> ver) throws NoSuchAlgorithmException {
        String sha256Hash = getSHA256Str(avatarId);
        String hash = sha256Hash.replaceAll("\\D", "").substring(0, 12);

        // 部位
        Map<String, String> parts = new HashMap<>();

        // 获取背景 (随机数 0-47)
        String envVal = getPartVal(hash.substring(0, 2));
        // 衣服
        String cloVal = getPartVal(hash.substring(2, 4));
        // 头部
        String headVal = getPartVal(hash.substring(4, 6));
        // 嘴巴
        String mouthVal = getPartVal(hash.substring(6, 8));
        // 眼睛
        String eyesVal = getPartVal(hash.substring(8, 10));
        // 头发头饰
        String topVal = getPartVal(hash.substring(10));

        parts.put(Part.ENV, envVal);
        parts.put(Part.CLO, cloVal);
        parts.put(Part.HEAD, headVal);
        parts.put(Part.MOUTH, mouthVal);
        parts.put(Part.EYES, eyesVal);
        parts.put(Part.TOP, topVal);

        // 获取各部位 SVG
        Map<String, String> finals = new HashMap<>();
        for (Map.Entry<String, String> entry : parts.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            int intV = Integer.parseInt(v);

            /*
             * 部位随机数 0-15，使用主题 A
             * 部位随机数 16-31，使用主题 B
             * 部位随机数 32-47，使用主题 C
             * 同时将随机数转成 0-15 的数值，对应每个部位的 16 种不同形状
             */
            String theme = ThemeV.A;
            if (intV > 31) {
                intV -= 32;
                theme = ThemeV.C;
            } else if (intV > 15) {
                intV -= 16;
                theme = ThemeV.B;
            }
            String partV = intV < 10 ? "0" + intV : "" + intV;

            if (ver != null) {
                partV = ver.get(k);
                theme = ver.get(v);
            }
            // 获取每个部位最终的 SVG
            finals.put(k, getFinal(k, partV, theme));
        }

        // 是否无背景
        if (sansEnv) {
            finals.put(Part.ENV, "");
        }

        // 完整 SVG
        return String.join("", Constants.SVG_BEGIN, finals.get(Part.ENV), finals.get(Part.HEAD), finals.get(Part.CLO), finals.get(Part.TOP), finals.get(Part.EYES), finals.get(Part.MOUTH), Constants.SVG_END);
    }

    /**
     * 获取每个部位的 svg 代码
     *
     * @param part 部位
     * @param partV 形状
     * @param theme 主题
     * @return 部位的svg字符串
     */
    private static String getFinal(String part, String partV, String theme) {
        String[] colors = Themes.getColors(partV, theme, part);
        String svgString = Shapes.getShape(partV, part);

        Matcher m = pattern.matcher(svgString);
        int i = 0;
        while (m.find()) {
            svgString = svgString.replaceFirst(m.group(), colors[i]);
            i++;
        }

        return svgString;
    }

    /**
     * 把 hash 中表示各部位的数值转换为 0-47 的字符串
     *
     * @param partHash hash
     * @return String
     */
    private static String getPartVal(String partHash) {
        double scale = (ShapeV.PARTV_COUNT * ThemeV.THEME_COUNT - 1) / 100d;
        return String.valueOf(Math.round(scale * Double.parseDouble(partHash)));
    }

    /**
     * 利用java原生的摘要实现SHA256加密
     *
     * @param str 原文
     * @return 密文 | String
     * @throws NoSuchAlgorithmException     NoSuchAlgorithmException
     */
    public static String getSHA256Str(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        return byte2Hex(messageDigest.digest());
    }

    /**
     * 将byte转为16进制
     *
     * @param bytes 字节数组
     * @return 16 进制字符串
     */
    private static String byte2Hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        String temp;
        for (byte aByte : bytes) {
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                sb.append("0");
            }
            sb.append(temp);
        }
        return sb.toString();
    }

    public static String randomStr(int minLen, int maxLen) {
        Random random = new Random();
        int length = minLen + random.nextInt(maxLen - minLen + 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(CHARS.charAt(random.nextInt(CHARS.length())));
        }

        return sb.toString();
    }

    public static String randomStr(int len) {
        return randomStr(len, len);
    }
}
