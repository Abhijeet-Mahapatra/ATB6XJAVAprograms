package ex_23042024;

public class Lab073 {
    public static void main(String[] args) {
        // Even and Odd number
        // 7 - odd , 4 - even
        // num %==0 -> even
        // else it is odd

        //    2 | 11 | 5 - Quotient|
        //        10 |
        //           | 1 - Remainder |

        int num = 11;
        if (num%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
