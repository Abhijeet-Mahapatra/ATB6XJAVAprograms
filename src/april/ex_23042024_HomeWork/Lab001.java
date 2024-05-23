package april.ex_23042024_HomeWork;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        // Positive or Negative number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println("The number is zero: " +number);
        } else if (number > 0) {
            System.out.println("The number is positive: " +number);
        }else {
            System.out.println("The number is negative: " +number);
        }
        scanner.close();
    }
}
