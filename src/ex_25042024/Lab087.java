package ex_25042024;

public class Lab087 {
    public static void main(String[] args) {
        int itemCode = 001;
        // Declaring multiple condition in one case works only with JDK version above 13

        switch (itemCode) {
            case 001 -> System.out.println("It's a Laptop!");
            case 002 -> System.out.println("It's a Desktop!");
            case 003 -> System.out.println("It's a mobile Phone!");
            default -> System.out.println("Hello!");
        }

        char ch = 'z';
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
