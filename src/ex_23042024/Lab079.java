package ex_23042024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {

        // Triangle Classifier
        // Write a program that classifies a triangle based on its sides lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal)
        // isosceles (exactly two sides are equal) , or
        // scalene (no sides are equal)
        // Use an if-else statement to classify the triangle
        // side1, side2, side3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1, side2, side3, I will tell about the triangle");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 == side2 && side1 == side3 && side2 == side3){
            System.out.println("Equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

    }
}
