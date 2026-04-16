package decoder;
import utils.Base64Table;

public class Base64Decoder {
    public static String decode(String input) {

        
        int padding = 0;

        if (input.endsWith("==")) padding = 2;
        else if (input.endsWith("=")) padding = 1;

        input = input.replace("=", "");

        StringBuilder binary = new StringBuilder();
            for (char c : input.toCharArray()) {
            int value = Base64Table.REVERSE_TABLE.get(c);
            String bin = String.format("%6s", Integer.toBinaryString(value))
                    .replace(' ', '0');
            binary.append(bin);
            }
           

        if (padding > 0) {
            binary.setLength(binary.length() - padding * 2);
        }

        StringBuilder decoded = new StringBuilder();

        
        for (int i = 0; i + 8 <= binary.length(); i += 8) {
            String byteStr = binary.substring(i, i + 8);
            int charCode = Integer.parseInt(byteStr, 2);
            decoded.append((char) charCode);
        }



        return decoded.toString();
            
        } 
               
}
