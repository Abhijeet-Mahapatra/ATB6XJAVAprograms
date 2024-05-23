package may.ex_02052024_HomeWork;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        // Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}

        float[] numbers = new float[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of the array:");
        numbers[0] = sc.nextFloat();
        System.out.println("Enter the second number of the array:");
        numbers[1] = sc.nextFloat();
        System.out.println("Enter the third number of the array:");
        numbers[2] = sc.nextFloat();

        float[] double_array = new float[3];

        for (int i = 0; i < numbers.length; i++) {
            double_array[i] = numbers[i] * 2;
        }

        for (int i = 0; i < double_array.length; i++) {
            System.out.println(double_array[i]);

        }
    }
}
