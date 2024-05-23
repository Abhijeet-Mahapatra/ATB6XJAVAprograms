package may.ex_04072024;

public class Lab156 {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        System.out.println("End of the Program");
        main(10);
        main("Pramod");

    }
    static void main(int a){
        System.out.println(a);
    }
    static void main(String a){
        System.out.println(a);
    }

    static String main(String[] a, String b){
        System.out.println(a);
        return "Hello";
    }

    static void god(){
        main(new String[]{"12"});

    }

   static void giveMoneyBeg() {
       System.out.println("Blessings!!");
    }

    static int giveMoneyFriend(int i) {
        i = i + 8;
        return i;
    }
}
