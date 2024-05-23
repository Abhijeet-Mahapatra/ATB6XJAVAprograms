package may.ex_04052024;

public class Lab137 {
    public static void main(String[] args) {
        int[] array_1d = {450, 50, 321};

        // 2D arrays
        // Matrix -> Rows and Columns

        // rows -> Horizontal
        // Columns -> Vertical

        int [][] array_2d ={
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };

        int [][] array_2d_2 = new int[3][3];
        // |0, 0, 0|
        // |0, 0, 0|
        // |0, 0, 0|
        array_2d_2[0][0] = 34;
        // |34, 0, 0|
        // |0, 0, 0|
        // |0, 0, 0|
        array_2d_2[0][1] = 12;
        // |34, 12, 0|
        // |0, 0, 0|
        // |0, 0, 0|

        for (int i = 0; i < array_2d.length; i++) {            // Rows  -> 0, 1, 2
            for (int j = 0; j < array_2d[i].length; j++) {     // Columns -> 0, 1, 2
                System.out.println(array_2d[i][j]);
            }

        }
    }
}
