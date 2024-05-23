package april.ex_13042024;

public class IQ003 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b);

        String name = "Pramod";
        System.out.println(a+name);
        System.out.println(name+a);
       // First number is integer and the second is integer so first mathematical operation will happen the concatenation will happen as per the JVM will execute the code from left to right
        System.out.println(a+b+name);
       // In the below case First is String so it will concatenate the below condition from left to right, and no mathematical operation will happen
        System.out.println(name+a+b);
       // Here also concatenation will happen only
        System.out.println(a+name+b);
    }
}
