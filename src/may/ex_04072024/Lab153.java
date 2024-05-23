package may.ex_04072024;

public class Lab153 {
    public static void main(String[] args) {
        // Non-Return with no parameter
        saySomethingPlease();
        // Non-Return with parameter
        sayHelloToYou("Pramod");
        // Return with no parameter
        int sum = sumOfTwoBad();
        System.out.println(sum);
        // Return with parameter
        int result = sumOfTwoGood(3,4);
        System.out.println(result);
    }

    private static int sumOfTwoGood(int a, int b) {
        return a+b;
    }

    static int sumOfTwoBad() {
        return 5+6;
    }

    static void sayHelloToYou(String name) {
        System.out.println("Hello "+name);
    }

    static void saySomethingPlease() {
        System.out.println("Non-Return with no parameter");
    }
}
