package ex_23042024;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        // Taking an input from user from keyboard
        // Scanner class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        if (num%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        scanner.close();
    }
}
