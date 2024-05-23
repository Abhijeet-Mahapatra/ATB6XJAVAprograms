package april.ex_20042024;

public class Lab054 {
    public static void main(String[] args) {
        String name = "Pramod";
        // How the String is Different
        // Strings are immutable in nature that means which can't be changed
        // Strings are immutable, non-primitive data types in java
        // immutable - that can't be changed

        name = "Dutta"; // In this case internally a new String will be created for name in the same the String Constant pool as "Pramod"
        System.out.println(name);
    }

}
