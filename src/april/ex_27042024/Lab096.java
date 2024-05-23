package april.ex_27042024;

import java.util.Scanner;

public class Lab096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one Alphabet, will tell you if it vowel or consonant: ");
        char alphabet = scanner.next().charAt(0);
        char ch = Character.toUpperCase(alphabet);

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U'){
            System.out.println("This is vowel: " +ch);
        } else {
            System.out.println("This is consonant: " +ch);
        }
        scanner.close();
    }
}
