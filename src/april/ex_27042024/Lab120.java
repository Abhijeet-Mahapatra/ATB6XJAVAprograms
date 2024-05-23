package april.ex_27042024;

import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {

        // Factorial Program
        // 1! -> 1
        // 2! -> 2*1
        // 3! -> 3*2*1 ->6
        // 4! -> 4*3*2*1 -> 24
        // 5! -> 5*4*3*2*1 -> 120

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        long fact = 1;

        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        scanner.close();
    }
}
