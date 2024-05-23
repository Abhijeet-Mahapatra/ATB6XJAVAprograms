package april.ex_23042024;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number > 20){
            System.out.println("Num > 20");
        }else if (number > 10){
            System.out.println("num is between 10 and 20");
        }else {
            System.out.println("num < 10");
        }
        scanner.close();
    }
}
