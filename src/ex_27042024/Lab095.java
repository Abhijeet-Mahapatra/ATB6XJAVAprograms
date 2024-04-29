package ex_27042024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers to check Largest: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 >= number2 && number1 >= number3){
            System.out.println("The Largest number is: " +number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The Largest number is: " +number2);
        } else {
            System.out.println("The Largest number is: " +number3);
        }

        // Ternary Operator  -> ? -> condition ? (if true) -> do this : (if false) do this

        int largest = (number1 > number2) ?  ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3) ;
        System.out.println(largest);

        scanner.close();
    }
}
