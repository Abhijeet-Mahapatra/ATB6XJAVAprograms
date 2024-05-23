package april.ex_20042024;

public class Lab053 {
    public static void main(String[] args) {
        String name = "Pramod";  // Assignment Operator
        String name2 = new String("Pramod"); // new Operator
        // Both of them actually save the name , name2 in different ways JVM, In this case object reference will be different for both of these name, name2
        if (name == name2){
            System.out.println("name object reference is same as name2");
        }
        else {
            System.out.println("name object reference is not same as name2");
        }


        // But if we declare it as below then the object reference will be same even one is declared with assignment and another is with new operators
        String name3 = "Pramod";
        String name4 = new String();
                name4= "Pramod";

        if (name3 == name4){
            System.out.println("name3 object reference is same as name4");
        }
        else {
            System.out.println("name3 object reference is not same as name4");
        }

        System.out.println(name);
        System.out.println("Your name is -> " +name);
        System.out.printf("Your name is -> %s",name);

        System.out.println("\n -- All the functions available in String --");

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());


        int age = 65;
        char c = 'a';
        boolean b = true;

        // Primitive data types - byte, int, long, short, double, float, char, boolean  - All of them don't have extra functionality like Non-Primitive data types.
        // Java is not pure object oriented. One of the biggest reason is due to Primitive data types.

        // NOn-Primitive Data types - String - has extra functionalities



    }
}
