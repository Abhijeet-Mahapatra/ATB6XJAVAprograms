package ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        // Max number in two

        System.out.println("Enter num 1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Enter num 2");
        int num2 = scanner.nextInt();

        // Max number using Math.max() function

        int max = Math.max(num1, num2);
        System.out.println("Max by Math.max() function " +max);

        // Max number using if-else condition

        if (num1 > num2){
            System.out.println("Max is ->  " +num1);
        }else {
            System.out.println("Max is -> " +num2);
        }
        scanner.close();

    }
}
