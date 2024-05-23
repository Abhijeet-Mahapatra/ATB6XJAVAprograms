package april.ex_27042024;

public class Lab109 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);  // Print first then execute the condition below
                                    // So in this case it will print from 1 to 5

            if (i == 5) {
                break;
            }
            System.out.println(i);   // Execute the condition first then print
                                     // So in this case it will print from 1 to 4

        }



    }
}
