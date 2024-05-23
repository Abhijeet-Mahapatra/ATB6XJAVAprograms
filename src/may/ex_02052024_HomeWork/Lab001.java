package may.ex_02052024_HomeWork;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        // Create a Program which takes arrays and print all the marks.

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the marks for subject#1: ");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the marks for subject#2: ");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks for subject#3: ");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the marks for subject#4: ");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the marks for subject#5: ");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Your marks for subject#"+ (i+1) + " is " + marks[i]);

        }


        
    }
}
