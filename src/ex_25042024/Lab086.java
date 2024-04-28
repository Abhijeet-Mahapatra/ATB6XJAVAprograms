package ex_25042024;

public class Lab086 {
    public static void main(String[] args) {
        // Declaring multiple condition in one case works only with JDK version above 13
        int itemCode = 010;
        switch (itemCode) {
            case 001, 002, 003 :
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007 :
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("None");
        }
    }
}
