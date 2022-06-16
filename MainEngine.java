import java.security.KeyStoreException;
import java.util.Scanner;

public class MainEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Minh's Encryption 2.0!");
        System.out.println("Please enter an option (1. Encrypt  2. Decrypt):");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter either key 1 or 2:");
            int key = sc.nextInt();
            if (key == 1) {
                System.out.println("Enter your message:");
                sc.nextLine();
                String theMessage = sc.nextLine();
                KeyOne theChosenKey = new KeyOne(theMessage);
                System.out.println("Your final message: " + theChosenKey.getMessage());
            } else if (key == 2) {
                // for encryption key 2
            }
        } else if (choice == 2) {
            // ... for decryption
        }
    }
}