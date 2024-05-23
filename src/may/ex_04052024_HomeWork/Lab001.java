package may.ex_04052024_HomeWork;

public class Lab001 {
    public static void main(String[] args) {
        // Java method to find the maximum value in a 2D array.

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int max_number =Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j] > max_number){
                    max_number = arr[i][j];
                }
            }
        }
        System.out.println("Max is -> "+max_number);
    }
}
