package may.ex_02052024;

public class Lab127 {
    public static void main(String[] args) {
        // == -> object reference
        // .equals() -> Values/content

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);

        int[] arr3 = arr1;
        System.out.println(arr1==arr3);

        System.out.println(arr1.equals(arr2));  // checks the object reference so returns false in this case as it checks content only for String

        String s1 = "Pramod";
        String s2 = "Pramod";
        System.out.println(s1.equals(s2));  // Checks the content only in case of String

    }
}
