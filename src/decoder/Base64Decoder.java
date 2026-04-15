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

                    // perfshirja per return
                 StringBuilder decoded = new StringBuilder();

            }
            return decoded.toString();
            
        } 
               
}
