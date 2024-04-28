package ex_25042024;

public class Lab085 {
    public static void main(String[] args) {
        byte b = 20;
        switch (b) {
            case 10:
                System.out.println("TEN");
                break;
        //    case 128:          // It will through error as 128 is out of byte range
        //        System.out.println("One Twenty Eight");
        //        break;
            default:
                System.out.println("Default");
        }
    }
}
