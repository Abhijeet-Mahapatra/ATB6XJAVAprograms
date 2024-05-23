package april.ex_27042024;

public class Lab122 {
    public static void main(String[] args) {

        int i = 10;
        do {
            System.out.println(i);    // in this do while loop it will print 10
            i++;                      // and then exit the loop as in do while loop execute first
        }while (i < 10);              // then checks the condition


        while (i < 10) {               // this while loop will not execute
            System.out.println(i);     // as in while loop condition is checked first before the execution
            i++;
        }
    }
}
