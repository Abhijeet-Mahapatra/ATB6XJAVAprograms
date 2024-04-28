package ex_20042024_HomeWork;

public class HomeWork004 {
    public static void main(String[] args) {
        int x = 10;
        float y = 12.4f;
        float z = 56.78f;
        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("The result is: " +result);

    }
}
