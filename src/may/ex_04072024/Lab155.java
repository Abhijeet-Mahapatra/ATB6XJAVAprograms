package may.ex_04072024;

public class Lab155 {
    public static void main(String[] args) {
        // 1 Friend - Money
        // 1 Beg - Money

        System.out.println("Start of the Program");
        int money = giveMoneyFriend(100);
        System.out.println(money);
        giveMoneyBeg();
        System.out.println("End of the Program");
    }

   static void giveMoneyBeg() {
       System.out.println("Blessings!!");
    }

    static int giveMoneyFriend(int i) {
        i = i + 8;
        return i;
    }
}
