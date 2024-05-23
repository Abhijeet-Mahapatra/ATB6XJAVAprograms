package may.ex_04052024_HomeWork;

public class Lab003 {
    public static void main(String[] args) {
        // Write a Java method to transpose a given 2D array.

        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] transpose_arr = new int [3][3];

        for (int i = 0; i < transpose_arr.length; i++) {
            for (int j = 0; j < transpose_arr[i].length; j++) {
                transpose_arr[i][j] = arr[j][i];
                System.out.println(transpose_arr[i][j]);
            }
        }
    }
}
