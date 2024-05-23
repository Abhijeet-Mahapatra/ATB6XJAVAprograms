package april.ex_27042024;

public class Lab108 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Pramod");
        }
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Pramod");
        }

        // both the for loop above are correct just the difference of indexing
        // first will start with and end with 9
        // second loop will start with 1 and end with 10
        // BUT both of them will run the code 10 times

        // |i = 0|  |i = 1|
        // |i = 1|  |i = 2|
        // |i = 2|  |i = 3|
        // |i = 3|  |i = 4|
        // |i = 4|  |i = 5|
        // |i = 5|  |i = 6|
        // |i = 6|  |i = 7|
        // |i = 7|  |i = 8|
        // |i = 8|  |i = 9|
        // |i = 9|  |i = 10|
    }
}
