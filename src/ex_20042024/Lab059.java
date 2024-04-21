package ex_20042024;

public class Lab059 {
    public static void main(String[] args) {
        String name1 = "The Testing Academy";  //String Constant Pool
        String name2 = "The Testing Academy";  //String Constant Pool
        String name3 = new String("The Testing Academy");  // Heap Area(OA)

        System.out.println(name1==name2);  // checks the object reference // It will return true as the object reference of these two strings are same
        System.out.println(name1.equals(name2));  // checks the values

        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));


    }
}
