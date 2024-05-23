package may.ex_02052024;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the first sub 1 Marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter the second sub 2 Marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter the third sub 3 Marks");
        marks[2] = sc.nextInt();
        System.out.println("Enter the forth sub 4 Marks");
        marks[3]  = sc.nextInt();
        System.out.println("Enter the fifth sub 5 Marks");
        marks[4] = sc.nextInt();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 30){
                System.out.println("Failed in this subject -> " +marks[i]);
            }
            System.out.println(marks[i]);
            
        }

        int j = 0;
        while (j < marks.length){
            System.out.println(marks[j]);
            j++;
        }
        sc.close();

        String[] d = {"Pramod", "45", "true", "45.43", "!@#$#@", "null", ""}; // this is valid
    }
}
