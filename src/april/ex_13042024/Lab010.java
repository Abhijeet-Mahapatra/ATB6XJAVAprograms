package april.ex_13042024;

public class Lab010 {
    public static void main(String[] args) {
        System.out.println("Variables");

        // data_types variables_name = variable_value(literal)

        //Java ->
        // Primitive Data Type
        // byte, short, int, long, char
        // float, double
        // boolean - true and false

        // Non Primitive Data Types
        // String, Arrays, Class

        // This name identifier - variable_name
        // Rule 1 - Unique
        // int age = 54;

        // Rule 2 - No Keywords
        // Can't use Static, public, class etc.

        // Rule 3 - A-Z, a-z , $, _ starts
        int a = 66;
        int Z = 66;
        int $ = 66;
        // int _ = 66; // its is not supported on JDK21 but supported in JDK22
        int $_age = 66;
        int $_age2 = 66;

        // Variable name can not starts with number, like below examples we can not use
        // int #1 = 34;
        // int 1name = 34;
        // int 123_name =34;
        // int #1 = 34;

        // Can not use same variable names with different data type as example below are invalid
        // int age = 65;
        // byte age = 78;

        int age =66;
        System.out.println(age);
    }
}
