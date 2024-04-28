package ex_25042024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x");
        double x = scanner.nextDouble();
        System.out.println("Enter the value for y");
        double y = scanner.nextDouble();
        System.out.println("Enter the value for z");
        double z = scanner.nextDouble();

        double result;
        // 3/ x^2 + y^2 - |z|
        // A + B - C , A -> x^2, B -> y^2, C -> |z| abs(z) -> -1 -> 1 , -2 -> 2
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        scanner.close();
    }
}
