package me.imarlon.multiavatar;

import me.imarlon.multiavatar.constant.Part;
import me.imarlon.multiavatar.constant.ShapeV;
import me.imarlon.multiavatar.constant.ThemeV;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 颜色字典
 * @author marlon
 */
public class Themes {

    private final static Map<String, String[]> CACHE = new ConcurrentHashMap<>();

    private Themes() {
    }

    static {
        // Robo
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.A, Part.ENV), new String[]{ "#ff2f2b" });
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.A, Part.CLO), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.A, Part.HEAD), new String[]{"#fff"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.A, Part.MOUTH), new String[]{"#fff", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.A, Part.EYES), new String[]{"#000", "none", "#00FFFF"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.A, Part.TOP), new String[]{"#fff", "#fff"});

        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.B, Part.ENV), new String[]{"#ff1ec1"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.B, Part.CLO), new String[]{"#000", "#fff" });
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.B, Part.HEAD), new String[]{"#ffc1c1"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.B, Part.MOUTH), new String[]{"#fff", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.B, Part.EYES), new String[]{"#FF2D00", "#fff", "none"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.B, Part.TOP), new String[]{"#a21d00", "#fff"});

        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.C, Part.ENV), new String[]{"#0079b1"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.C, Part.CLO), new String[]{"#0e00b1", "#d1fffe"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.C, Part.HEAD), new String[]{"#f5aa77"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.C, Part.MOUTH), new String[]{"#fff", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.C, Part.EYES), new String[]{"#0c00de", "#fff", "none"});
        CACHE.put(String.join(":", ShapeV.Robo, ThemeV.C, Part.TOP), new String[]{"#acfffd", "#acfffd"});

        // Girl
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.A, Part.ENV), new String[]{"#a50000"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.A, Part.CLO), new String[]{"#f06", "#8e0039"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.A, Part.HEAD), new String[]{"#85492C"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.A, Part.MOUTH), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.A, Part.EYES), new String[]{"#000", "#ff9809"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.A, Part.TOP), new String[]{"#ff9809", "#ff9809", "none", "none"});

        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.B, Part.ENV), new String[]{"#40E83B"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.B, Part.CLO), new String[]{"#00650b", "#62ce5a"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.B, Part.HEAD), new String[]{"#f7c1a6"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.B, Part.MOUTH), new String[]{"#6e1c1c"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.B, Part.EYES), new String[]{"#000", "#ff833b"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.B, Part.TOP), new String[]{"#67FFCC", "none", "none", "#ecff3b"});

        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.C, Part.ENV), new String[]{"#ff2c2c"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.C, Part.CLO), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.C, Part.HEAD), new String[]{"#ffce8b"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.C, Part.MOUTH), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.C, Part.EYES), new String[]{"#000", "#0072ff"});
        CACHE.put(String.join(":", ShapeV.Girl, ThemeV.C, Part.TOP), new String[]{"#ff9809", "none", "#ffc809", "none"});

        // Blonde
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.A, Part.ENV), new String[]{"#ff7520"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.A, Part.CLO), new String[]{"#d12823"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.A, Part.HEAD), new String[]{"#fee3c5"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.A, Part.MOUTH), new String[]{"#d12823"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.A, Part.EYES), new String[]{"#000", "none"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.A, Part.TOP), new String[]{"#000", "none", "none",  "#FFCC00", "red"});

        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.B, Part.ENV), new String[]{"#ff9700"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.B, Part.CLO), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.B, Part.HEAD), new String[]{"#d2ad6d"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.B, Part.MOUTH), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.B, Part.EYES), new String[]{"#000", "#00ffdc"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.B, Part.TOP), new String[]{"#fdff00", "#fdff00", "none", "none", "none"});

        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.C, Part.ENV), new String[]{"#26a7ff"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.C, Part.CLO), new String[]{"#d85cd7"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.C, Part.HEAD), new String[]{"#542e02"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.C, Part.MOUTH), new String[]{"#f70014"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.C, Part.EYES), new String[]{"#000", "magenta"});
        CACHE.put(String.join(":", ShapeV.Blonde, ThemeV.C, Part.TOP), new String[]{"#FFCC00", "#FFCC00", "#FFCC00", "#ff0000", "yellow"});

        // Evilnormie
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.A, Part.ENV), new String[]{"#6FC30E"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.A, Part.CLO), new String[]{"#b4e1fa", "#5b5d6e", "#515262", "#a0d2f0", "#a0d2f0"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.A, Part.HEAD), new String[]{"#fae3b9"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.A, Part.MOUTH), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.A, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.A, Part.TOP), new String[]{"#8eff45", "#8eff45", "none", "none"});

        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.B, Part.ENV), new String[]{"#00a58c"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.B, Part.CLO), new String[]{"#000", "none", "none", "none", "none"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.B, Part.HEAD), new String[]{"#FAD2B9"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.B, Part.MOUTH), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.B, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.B, Part.TOP), new String[]{"#FFC600", "none", "#FFC600", "none"});

        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.C, Part.ENV), new String[]{"#ff501f"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.C, Part.CLO), new String[]{"#000", "#ff0000", "#ff0000", "#7d7d7d", "#7d7d7d"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.C, Part.HEAD), new String[]{"#fff3dc"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.C, Part.MOUTH), new String[]{"#d2001b", "none"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.C, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Evilnormie, ThemeV.C, Part.TOP), new String[]{"#D2001B", "none", "none", "#D2001B"});

        // Country
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.A, Part.ENV), new String[]{"#fc0"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.A, Part.CLO), new String[]{"#901e0e", "#ffbe1e", "#ffbe1e", "#c55f54"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.A, Part.HEAD), new String[]{"#f8d9ad"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.A, Part.MOUTH), new String[]{"#000", "none", "#000", "none"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.A, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.A, Part.TOP), new String[]{"#583D00", "#AF892E", "#462D00", "#a0a0a0"});

        CACHE.put(String.join(":", ShapeV.Country, ThemeV.B, Part.ENV), new String[]{"#386465"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.B, Part.CLO), new String[]{"#fff", "#333", "#333", "#333"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.B, Part.HEAD), new String[]{"#FFD79D"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.B, Part.MOUTH), new String[]{"#000", "#000", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.B, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.B, Part.TOP), new String[]{"#27363C", "#5DCAD4", "#314652", "#333"});

        CACHE.put(String.join(":", ShapeV.Country, ThemeV.C, Part.ENV), new String[]{"#DFFF00"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.C, Part.CLO), new String[]{"#304267", "#aab0b1", "#aab0b1", "#aab0b1"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.C, Part.HEAD), new String[]{"#e6b876"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.C, Part.MOUTH), new String[]{"#50230a", "#50230a", "#50230a", "#50230a"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.C, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Country, ThemeV.C, Part.TOP), new String[]{"#333", "#afafaf", "#222", "#6d3a1d"});

        // Johnyold
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.A, Part.ENV), new String[]{"#a09300"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.A, Part.CLO), new String[]{"#c7d4e2", "#435363", "#435363", "#141720", "#141720", "#e7ecf2", "#e7ecf2"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.A, Part.HEAD), new String[]{"#f5d4a6"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.A, Part.MOUTH), new String[]{"#000", "#cf9f76"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.A, Part.EYES), new String[]{"#000", "#000", "#000", "#000", "#000", "#000", "#fff", "#fff", "#fff", "#fff", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.A, Part.TOP), new String[]{"none", "#fdff00"});

        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.B, Part.ENV), new String[]{"#b3003e"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.B, Part.CLO), new String[]{"#000", "#435363", "#435363", "#000", "none", "#e7ecf2", "#e7ecf2"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.B, Part.HEAD), new String[]{"#f5d4a6"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.B, Part.MOUTH), new String[]{"#000", "#af9f94"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.B, Part.EYES), new String[]{"#9ff3ff;opacity:0.96", "#000", "#9ff3ff;opacity:0.96", "#000", "#2f508a", "#000", "#000", "#000", "none", "none", "none", "none"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.B, Part.TOP), new String[]{"#ff9a00", "#ff9a00"});

        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.C, Part.ENV), new String[]{"#884f00"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.C, Part.CLO), new String[]{"#ff0000", "#fff", "#fff", "#141720", "#141720", "#e7ecf2", "#e7ecf2"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.C, Part.HEAD), new String[]{"#c57b14"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.C, Part.MOUTH), new String[]{"#000", "#cf9f76"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.C, Part.EYES), new String[]{"none", "#000", "none", "#000", "#5a0000", "#000", "#000", "#000", "none", "none", "none", "none"});
        CACHE.put(String.join(":", ShapeV.Johnyold, ThemeV.C, Part.TOP), new String[]{"#efefef", "none"});

        // Asian
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.A, Part.ENV), new String[]{"#8acf00"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.A, Part.CLO), new String[]{"#ee2829", "#ff0"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.A, Part.HEAD), new String[]{"#ffce73"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.A, Part.MOUTH), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.A, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.A, Part.TOP), new String[]{"#000","#000","none", "#000", "#ff4e4e", "#000"});

        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.B, Part.ENV), new String[]{"#00d2a3"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.B, Part.CLO), new String[]{"#0D0046", "#ffce73"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.B, Part.HEAD), new String[]{"#ffce73"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.B, Part.MOUTH), new String[]{"#000", "none"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.B, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.B, Part.TOP), new String[]{"#000","#000","#000", "none", "#ffb358",  "#000", "none", "none"});

        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.C, Part.ENV), new String[]{"#ff184e"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.C, Part.CLO), new String[]{"#000", "none"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.C, Part.HEAD), new String[]{"#ffce73"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.C, Part.MOUTH), new String[]{"#ff0000", "none"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.C, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Asian, ThemeV.C, Part.TOP), new String[]{"none","none","none", "none", "none",  "#ffc107", "none", "none"});

        // Punk
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.A, Part.ENV), new String[]{"#00deae"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.A, Part.CLO), new String[]{"#ff0000"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.A, Part.HEAD), new String[]{"#ffce94"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.A, Part.MOUTH), new String[]{"#f73b6c", "#000"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.A, Part.EYES), new String[]{"#e91e63", "#000", "#e91e63", "#000", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.A, Part.TOP), new String[]{"#dd104f", "#dd104f", "#f73b6c", "#dd104f"});

        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.B, Part.ENV), new String[]{"#181284"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.B, Part.CLO), new String[]{"#491f49", "#ff9809", "#491f49"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.B, Part.HEAD), new String[]{"#f6ba97"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.B, Part.MOUTH), new String[]{"#ff9809", "#000"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.B, Part.EYES), new String[]{"#c4ffe4", "#000", "#c4ffe4", "#000", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.B, Part.TOP), new String[]{ "none", "none", "#d6f740", "#516303"});

        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.C, Part.ENV), new String[]{"#bcf700"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.C, Part.CLO), new String[]{"#ff14e4", "#000", "#14fffd"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.C, Part.HEAD), new String[]{"#7b401e"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.C, Part.MOUTH), new String[]{"#666", "#000"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.C, Part.EYES), new String[]{"#00b5b4", "#000", "#00b5b4", "#000", "#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Punk, ThemeV.C, Part.TOP), new String[]{"#14fffd", "#14fffd", "#14fffd", "#0d3a62"});

        // Afrohair
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.A, Part.ENV), new String[]{"#0df"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.A, Part.CLO), new String[]{"#571e57", "#ff0"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.A, Part.HEAD), new String[]{"#f2c280"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.A, Part.MOUTH), new String[]{"#ff0000"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.A, Part.EYES), new String[]{"#795548", "#000"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.A, Part.TOP), new String[]{"#de3b00", "none"});

        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.B, Part.ENV), new String[]{"#B400C2"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.B, Part.CLO), new String[]{"#0D204A", "#00ffdf"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.B, Part.HEAD), new String[]{"#ca8628"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.B, Part.MOUTH), new String[]{"#1a1a1a"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.B, Part.EYES), new String[]{"#cbbdaf", "#000"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.B, Part.TOP), new String[]{"#000", "#000"});

        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.C, Part.ENV), new String[]{"#ffe926"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.C, Part.CLO), new String[]{"#00d6af", "#000"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.C, Part.HEAD), new String[]{"#8c5100"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.C, Part.MOUTH), new String[]{"#7d0000"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.C, Part.EYES), new String[]{"none", "#000"});
        CACHE.put(String.join(":", ShapeV.Afrohair, ThemeV.C, Part.TOP), new String[]{"#f7f7f7", "none"});

        // Normie female
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.A, Part.ENV), new String[]{"#4aff0c"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.A, Part.CLO), new String[]{"#101010", "#fff", "#fff"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.A, Part.HEAD), new String[]{"#dbbc7f"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.A, Part.MOUTH), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.A, Part.EYES), new String[]{ "#000", "none", "none"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.A, Part.TOP), new String[]{"#531148", "#531148", "#531148", "none"});

        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.B, Part.ENV), new String[]{"#FFC107"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.B, Part.CLO), new String[]{"#033c58", "#fff", "#fff"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.B, Part.HEAD), new String[]{"#dbc97f"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.B, Part.MOUTH), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.B, Part.EYES), new String[]{"none", "#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.B, Part.TOP), new String[]{"#FFEB3B", "#FFEB3B", "none", "#FFEB3B"});

        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.C, Part.ENV), new String[]{"#FF9800"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.C, Part.CLO), new String[]{"#b40000", "#fff", "#fff"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.C, Part.HEAD), new String[]{"#E2AF6B"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.C, Part.MOUTH), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.C, Part.EYES), new String[]{"none", "#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Normie_female, ThemeV.C, Part.TOP), new String[]{"#ec0000", "#ec0000", "none", "none"});

        // Older
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.A, Part.ENV), new String[]{"#104c8c"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.A, Part.CLO), new String[]{"#354B65", "#3D8EBB", "#89D0DA", "#00FFFD" });
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.A, Part.HEAD), new String[]{"#cc9a5c"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.A, Part.MOUTH), new String[]{"#222", "#fff"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.A, Part.EYES), new String[]{"#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.A, Part.TOP), new String[]{"#fff", "#fff", "none"});

        CACHE.put(String.join(":", ShapeV.Older, ThemeV.B, Part.ENV), new String[]{"#0DC15C"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.B, Part.CLO), new String[]{"#212121", "#fff", "#212121", "#fff", });
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.B, Part.HEAD), new String[]{"#dca45f"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.B, Part.MOUTH), new String[]{"#111", "#633b1d"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.B, Part.EYES), new String[]{"#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.B, Part.TOP), new String[]{"none", "#792B74", "#792B74"});

        CACHE.put(String.join(":", ShapeV.Older, ThemeV.C, Part.ENV), new String[]{"#ffe500"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.C, Part.CLO), new String[]{"#1e5e80", "#fff", "#1e5e80", "#fff"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.C, Part.HEAD), new String[]{"#e8bc86"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.C, Part.MOUTH), new String[]{"#111", "none"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.C, Part.EYES), new String[]{"#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Older, ThemeV.C, Part.TOP), new String[]{"none", "none", "#633b1d"});

        // Firehair
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.A, Part.ENV), new String[]{"#4a3f73"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.A, Part.CLO), new String[]{"#e6e9ee", "#f1543f", "#ff7058", "#fff", "#fff"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.A, Part.HEAD), new String[]{"#b27e5b"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.A, Part.MOUTH), new String[]{"#191919", "#191919"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.A, Part.EYES), new String[]{"#000", "#000", "#57FFFD"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.A, Part.TOP), new String[]{"#ffc", "#ffc", "#ffc"});

        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.B, Part.ENV), new String[]{"#00a08d"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.B, Part.CLO), new String[]{"#FFBA32", "#484848", "#4e4e4e", "#fff", "#fff"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.B, Part.HEAD), new String[]{"#ab5f2c"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.B, Part.MOUTH), new String[]{"#191919", "#191919"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.B, Part.EYES), new String[]{"#000", "#ff23fa;opacity:0.39", "#000"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.B, Part.TOP), new String[]{"#ff90f4", "#ff90f4", "#ff90f4"});

        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.C, Part.ENV), new String[]{"#22535d"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.C, Part.CLO), new String[]{"#000", "#ff2500", "#ff2500", "#fff", "#fff"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.C, Part.HEAD), new String[]{"#a76c44"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.C, Part.MOUTH), new String[]{"#191919", "#191919"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.C, Part.EYES), new String[]{"#000", "none", "#000"});
        CACHE.put(String.join(":", ShapeV.Firehair, ThemeV.C, Part.TOP), new String[]{"none", "#00efff", "none"});

        // Blond
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.A, Part.ENV), new String[]{"#2668DC"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.A, Part.CLO), new String[]{"#2385c6", "#b8d0e0", "#b8d0e0"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.A, Part.HEAD), new String[]{"#ad8a60"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.A, Part.MOUTH), new String[]{"#000", "#4d4d4d"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.A, Part.EYES), new String[]{"#7fb5a2", "#d1eddf", "#301e19"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.A, Part.TOP), new String[]{"#fff510", "#fff510"});

        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.B, Part.ENV), new String[]{"#643869"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.B, Part.CLO), new String[]{"#D67D1B", "#b8d0e0", "#b8d0e0"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.B, Part.HEAD), new String[]{"#CC985A", "none0000"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.B, Part.MOUTH), new String[]{"#000", "#ececec"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.B, Part.EYES), new String[]{"#1f2644", "#9b97ce", "#301e19"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.B, Part.TOP), new String[]{"#00eaff", "none"});

        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.C, Part.ENV), new String[]{"#F599FF"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.C, Part.CLO), new String[]{"#2823C6", "#b8d0e0", "#b8d0e0"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.C, Part.HEAD), new String[]{"#C7873A"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.C, Part.MOUTH), new String[]{"#000", "#4d4d4d"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.C, Part.EYES), new String[]{"#581b1b", "#FF8B8B", "#000"});
        CACHE.put(String.join(":", ShapeV.Blond, ThemeV.C, Part.TOP), new String[]{"none", "#9c0092"});

        // Ateam
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.A, Part.ENV), new String[]{"#d10084"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.A, Part.CLO), new String[]{"#efedee", "#00a1e0", "#00a1e0", "#efedee", "#ffce1c"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.A, Part.HEAD), new String[]{"#b35f49"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.A, Part.MOUTH), new String[]{"#3a484a", "#000"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.A, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.A, Part.TOP), new String[]{"#000", "none", "#000", "none"});

        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.B, Part.ENV), new String[]{"#E6C117"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.B, Part.CLO), new String[]{"#efedee", "#ec0033", "#ec0033", "#efedee", "#f2ff05"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.B, Part.HEAD), new String[]{"#ffc016"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.B, Part.MOUTH), new String[]{"#4a3737", "#000"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.B, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.B, Part.TOP), new String[]{"#ffe900", "#ffe900", "none", "#ffe900"});

        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.C, Part.ENV), new String[]{"#1d8c00"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.C, Part.CLO), new String[]{"#e000cb", "#fff", "#fff", "#e000cb", "#ffce1c"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.C, Part.HEAD), new String[]{"#b96438"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.C, Part.MOUTH), new String[]{"#000", "#000"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.C, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Ateam, ThemeV.C, Part.TOP), new String[]{"#53ffff", "#53ffff", "none", "none"});

        // Rasta
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.A, Part.ENV), new String[]{"#fc0065"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.A, Part.CLO), new String[]{"#708913", "#fdea14", "#708913", "#fdea14", "#708913"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.A, Part.HEAD), new String[]{"#DEA561"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.A, Part.MOUTH), new String[]{"#444", "#000"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.A, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.A, Part.TOP), new String[]{"#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f", "#32393f" });

        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.B, Part.ENV), new String[]{"#81f72e"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.B, Part.CLO), new String[]{"#ff0000", "#ffc107", "#ff0000", "#ffc107", "#ff0000"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.B, Part.HEAD), new String[]{"#ef9831"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.B, Part.MOUTH), new String[]{"#6b0000", "#000"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.B, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.B, Part.TOP), new String[]{"#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "#FFFAAD", "none", "none", "none", "none"});

        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.C, Part.ENV), new String[]{"#00D872"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.C, Part.CLO), new String[]{"#590D00", "#FD1336", "#590D00", "#FD1336", "#590D00"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.C, Part.HEAD), new String[]{"#c36c00"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.C, Part.MOUTH), new String[]{"#56442b", "#000"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.C, Part.EYES), new String[]{"#000"});
        CACHE.put(String.join(":", ShapeV.Rasta, ThemeV.C, Part.TOP), new String[]{"#004E4C", "#004E4C", "#004E4C", "#004E4C", "#004E4C", "#004E4C", "#004E4C", "#004E4C", "#004E4C", "none", "none", "none", "none", "none", "none", "none", "none"});

        // Meta
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.A, Part.ENV), new String[]{"#111"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.A, Part.CLO), new String[]{"#000", "#00FFFF"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.A, Part.HEAD), new String[]{"#755227"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.A, Part.MOUTH), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.A, Part.EYES), new String[]{"black", "#008;opacity:0.67", "aqua"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.A, Part.TOP), new String[]{"#fff", "#fff", "#fff", "#fff", "#fff"});

        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.B, Part.ENV), new String[]{"#00D0D4"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.B, Part.CLO), new String[]{"#000", "#fff"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.B, Part.HEAD), new String[]{"#755227"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.B, Part.MOUTH), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.B, Part.EYES), new String[]{"black", "#1df7ff;opacity:0.64", "#fcff2c"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.B, Part.TOP), new String[]{"#fff539", "none", "#fff539", "none", "#fff539"});

        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.C, Part.ENV), new String[]{"#DC75FF"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.C, Part.CLO), new String[]{"#000", "#FFBDEC"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.C, Part.HEAD), new String[]{"#997549"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.C, Part.MOUTH), new String[]{"#fff", "#000"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.C, Part.EYES), new String[]{"black", "black", "aqua"});
        CACHE.put(String.join(":", ShapeV.Meta, ThemeV.C, Part.TOP), new String[]{"#00fffd", "none", "none", "none", "none"});
    }

    public static String[] getColors(String partV, String theme, String part) {
        return CACHE.get(String.join(":", partV, theme, part));
    }
}
