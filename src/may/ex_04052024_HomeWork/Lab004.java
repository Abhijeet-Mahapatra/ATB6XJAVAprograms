package may.ex_04052024_HomeWork;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        // Java Anagrams - silent -> listen , length1 = length2,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word to check Anagrams: ");
        String user_word1 = scanner.next();
        System.out.println("Enter the second word to check Anagrams: ");
        String user_word2 = scanner.next();
        if (user_word1.length() == user_word2.length()){
            System.out.println("This is Anagram!");
        }else {
            System.out.println("Not Anagram!");
        }
    }
}
