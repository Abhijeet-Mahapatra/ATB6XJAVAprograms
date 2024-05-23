package april.ex_23042024;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        // Grade Calculator
        // Write a program that calculates and displays the letter grade for a given number
        // numerical scores ( eg : A, B, C, D, F) based  on the following
        // Grading Scale
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59

        // 1. Find the user inputs
        // Score - datatype ? - int
        // return -> grade -> datatype -> char
        // DAA - Ask for the confirmation for the doubts
        // Interviewer -> int, char

        // 2. Basic Logic
        // if (score >= 90 && score <= 100)  -> return or print grade - A
        // else if (score >= 80 && score <= 89)  -> return or print garde - B
        // else -> grade -> F

        // 3. Write the code

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Score: ");
        int score = scanner.nextInt();
        char grade = 'F' ;

        if (score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if ( score < 0 && score > 100) {
            System.out.println("Not a valid score");
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is: " +grade);
        scanner.close();

    }
}
