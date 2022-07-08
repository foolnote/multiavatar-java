# multiavatar-java
[multiavatar](https://multiavatar.com)的java实现

# Usage

```java
import me.imarlon.multiavatar.Avatar;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        String randomAvatar = Avatar.generate();
        String idAvatar = Avatar.generate("id");
        // and other overload methods...
    }
}

```
