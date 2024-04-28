package ex_23042024_HomeWork;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to check if its a leap year or not: ");
        int year = scanner.nextInt();

        if (year%4 == 0 && year%100 != 0 || year%400 ==0 ){
            System.out.println("This is a leap year: " +year);
        } else {
            System.out.println("This is not a leap year: " +year);
        }
        scanner.close();
    }
}
