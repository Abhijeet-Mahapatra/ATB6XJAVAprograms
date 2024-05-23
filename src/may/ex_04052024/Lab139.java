package may.ex_04052024;

public class Lab139 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {34, 1},
                {34, 2},
                {34, 3}
        };

        for (int i = 0; i < array_2d.length; i++) {         // Rows -> 0, 1, 2
            for (int j = 0; j < array_2d[i].length; j++) {  // Columns -> 0, 1
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
