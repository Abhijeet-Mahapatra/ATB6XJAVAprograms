package april.ex_25042024;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your Salary");
        double Salary = scanner.nextDouble();

        System.out.println("Your details are "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your Salary is "+Salary);

        scanner.close();
    }
}
