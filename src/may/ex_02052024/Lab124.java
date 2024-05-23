package may.ex_02052024;

public class Lab124 {
    public static void main(String[] args) {
        int[] ages = {27, 31, 32,33, 34};  // Fixed elements

        int[] age2 = new int[5]; // Case2 Here by default value of all the elements will be? 0
        System.out.println(age2[0]);
        System.out.println(age2[4]);

        age2[0] = 11;
        System.out.println(age2[0]);

        String[] breakfast_Items = {"milk", "idli", "fruits", "coffee", "tea", "poha"};
        System.out.println(breakfast_Items.length);

    }
}
