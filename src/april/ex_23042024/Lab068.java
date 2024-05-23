package april.ex_23042024;

public class Lab068 {
    public static void main(String[] args) {
        // Max in 3 numbers using ? operator

        int firstNumber = 123;
        int secondNumber = 2134;
        int thirdNumber = 432;

        int max1 = firstNumber > secondNumber ? firstNumber : secondNumber;
        int max2 = max1 > thirdNumber ? max1 : thirdNumber;

        System.out.println("Max number is: "+max2);
    }
}
