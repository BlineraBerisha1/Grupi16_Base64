package encoder;
import utils.Base64Table;

public class Base64Encoder {

    //
    public static String encode(String input) {
        StringBuilder binary = new StringBuilder();

        // Step 1: ASCII → Binary
        for (char c : input.toCharArray()) {
            String bin = String.format("%8s", Integer.toBinaryString(c))
                    .replace(' ', '0');
            binary.append(bin);
        }

        // Step 2: Pad binary to multiple of 6
        while (binary.length() % 6 != 0) {
            binary.append("0");
        }
        StringBuilder encoded = new StringBuilder();

        // Step 3: Convert each 6-bit group


        // Step 4: Add "=" padding

        return encoded.toString();
    }
}