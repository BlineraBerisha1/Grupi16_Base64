package main;

import encoder.Base64Encoder;
import decoder.Base64Decoder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Base64 Encoder/Decoder ===");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.print("Choose option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        if (choice == 1) {
            String result = Base64Encoder.encode(input);
            System.out.println("Encoded: " + result);
        } else if (choice == 2) {
            String result = Base64Decoder.decode(input);
            System.out.println("Decoded: " + result);
        } else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }
}