import java.awt.event.TextEvent;
import java.util.Scanner;
import java.util.SortedMap;

public class UI {

    public static void starter(){
        System.out.println("What do you want to do?");
        System.out.println("Type \"1\" to encrypt text");
        System.out.println("Type \"2\" to decrypt text");
        Scanner textScanner = new Scanner(System.in);  // Для строк
        Scanner numScanner = new Scanner(System.in);
        int answer = numScanner.nextInt();

        if(answer == 1){
            System.out.println("\nEnter text to encrypt");
            String text = textScanner.nextLine();
            System.out.println("Enter shift of Caesar Cipher");
            int shift = numScanner.nextInt();
            System.out.println("Encrypted text: " + Encryptor.textEncryptor(text, shift));
            System.out.println("\n");
            starter();

        } else if(answer == 2) {
            System.out.println("\nEnter text to decrypt");
            String text = textScanner.nextLine();
            System.out.println("Enter shift of Caesar Cipher");
            int shift = numScanner.nextInt();
            System.out.println("Decrypted text: " + Decryptor.textDecryptor(text, shift));
            System.out.println("\n");
            starter();
        } else {
            System.out.println("You have entered an invalid option");
            starter();
        }
    }


}
