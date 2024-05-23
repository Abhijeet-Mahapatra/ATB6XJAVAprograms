package may.ex_11052024_HomeWork;

public class Payment {
    String modeOfPayment;
    double amountPaid;

    void successfulPayment(){
        System.out.println("Rs."+amountPaid+" has been successfully paid through "+modeOfPayment+" payment");

    }
}
