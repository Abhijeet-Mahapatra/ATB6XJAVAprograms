package april.ex_20042024_HomeWork;

public class HomeWork001 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max_1 = a>b ? a : b;
        int max_2 = max_1>c ? max_1 :c;

        System.out.println("The Max value is: " +max_2);

    }
}
