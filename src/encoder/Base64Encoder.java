package encoder;
import utils.Base64Table;

public class Base64Encoder {
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
        for (int i=0;i<binary.length(); i+=6){
            String chunk = binary.substring(i, i+6);
            int index = Integer.parseInt(chunk, 2);
            encoded.append(Base64Table.TABLE.charAt(index));
        }

        // Step 4: Add "=" padding
        int padding = (3 - input.length() % 3) % 3;
        encoded.append("=".repeat(padding));

        return encoded.toString();
    }
}