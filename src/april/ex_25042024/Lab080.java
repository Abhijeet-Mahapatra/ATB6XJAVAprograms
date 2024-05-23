package april.ex_25042024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        // if else - condition (if, else if, else) - multiple condition
        // switch - multiple condition

        // which day it is?
        // 1 -> mon, sunday -> 7 , 4 -> Thur
        // 1,2,3,4,5,6,7 -> M,T,W,T,F,S,S

        // Create a simple program -> user will enter a number and we will tell which day it is

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell you day it is!");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon!");
                break;
            case 2:
                System.out.println("Tue!");
                break;
            case 3:
                System.out.println("Wed!");
                break;
            case 4:
                System.out.println("Thu!");
                break;
            case 5:
                System.out.println("Fri!");
                break;
            case 6:
                System.out.println("Sat!");
                break;
            case 7:
                System.out.println("Sun!");
                break;
            default:
                System.out.println("Only number 1-7 are allowed!");
        }
        System.out.println("---- End of Program I will be executed any how! I am outside of switch block!----");

    }
}
