package tests;

import encoder.Base64Encoder;
import decoder.Base64Decoder;

public class TestCases {

    public static void main(String[] args) {

        String input = "SECURITY";
        String encoded = Base64Encoder.encode(input);
        String decoded = Base64Decoder.decode(encoded);

        System.out.println("Input: " + input);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}