package may.ex_04052024;

import java.util.Scanner;

public class Lab144 {
    public static void main(String[] args) {
        // Palindrome - String
        // naman -> reverse -> naman -> Palindrome
        // Malayalam -> Palindrome
        // Madam, mom

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, I will check if it is Palindrome or not");
        String user_input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(user_input);
        String rev_user_input = stringBuilder.reverse().toString();
        if (user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome -> "+user_input);
        }else {
            System.out.println("Nope, its not Palindrome");
        }
    }
}
