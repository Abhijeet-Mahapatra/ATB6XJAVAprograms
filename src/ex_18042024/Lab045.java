package ex_18042024;

public class Lab045 {
    public static void main(String[] args) {
        // Post -> Value is first used for computing the result and then increment/decrement

        int a = 10;

        int b = a++;
        // b = 10
        // a = 11

        System.out.println(b);
        System.out.println(a);
    }
}