package may.ex_04072024;

public class Lab149 {
    public static void main(String[] args) {
        // Create a Function which will say Hi
        for (int i = 0; i < 100; i++) {
            sayHi();
            sayBye();
            rama();
        }
    }

    static void rama() {
        System.out.println("rama");
    }

    static void sayBye() {
        System.out.println("Bye");
    }

    static void sayHi(){
        System.out.println("Hello Hi");
    }
}
