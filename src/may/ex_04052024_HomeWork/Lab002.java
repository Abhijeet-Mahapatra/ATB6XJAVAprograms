package may.ex_04052024_HomeWork;

public class Lab002 {
    public static void main(String[] args) {
        // Write a Java method to check if a given element exists in a 2D array. ( element =8) , true

        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 10){
                    System.out.println(true);
                }
            }
        }
    }
}
