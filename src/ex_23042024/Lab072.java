package ex_23042024;

public class Lab072 {
    public static void main(String[] args) {
        boolean a = true;

        a = !a;

        if (2+2 >= 4){   // 4 > 4 or 4 == 4  -> true  - OR Gate
            System.out.println("Inside the loop will be executed when the condition is true");
        }
        System.out.println("This is outside the loop, it will be executed always " +a);
    }
}
