package may.ex_04052024;

public class Lab135 {
    public static void main(String[] args) {
        // Arrays
        // Collection of similar Data Types

        // Find the Max in the Arrays
        int [] salaries = {30, 50, 60, 90, 10, 100, 999, -1, -2};
        // How do we find the Max Sal in the array?
        // Loop -> Logic -> max -> max .... 0 to length

        int max_salary = Integer.MIN_VALUE;

        // Using for loop
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max_salary){
                max_salary = salaries[i];
            }
        }
        System.out.println("Max Sal using for loop-> "+max_salary);

        // Using while loop
        int j =0;
        while (j < salaries.length){
            if (salaries[j] > max_salary){
                max_salary = salaries[j];
            }
            j++;
        }
        System.out.println("Max Sal using while loop -> "+max_salary);
    }
}
