package may.ex_04052024;

public class Lab141 {
    public static void main(String[] args) {
        int [] arr = {23, 23, 43};
        // Using for-each loop
        for (int item : arr){
            System.out.println(item);
        }
        System.out.println();
        // Using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
