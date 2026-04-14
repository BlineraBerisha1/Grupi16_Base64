package utils;

import java.util.HashMap;
import java.util.Map;

public class Base64Table {
    public static final String TABLE =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static final Map<Character, Integer> REVERSE_TABLE = new HashMap<>();

    static {
        for (int i = 0; i < TABLE.length(); i++) {
            REVERSE_TABLE.put(TABLE.charAt(i), i);
        }
    }
}
