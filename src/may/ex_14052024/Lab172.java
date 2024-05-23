package may.ex_14052024;

public class Lab172 {
    public static void main(String[] args) {
        BankAccount sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        BankAccount hdfc_ref = new BankAccount("HDFC",10,"HDFC001");
        hdfc_ref.printDetails();

        BankAccount icici_ref = new BankAccount("ICICI", 20, "ICICI003");
        icici_ref.printDetails();

        BankAccount yesbank_ref = new BankAccount("Yes Bank", -1, "YES002");
        yesbank_ref.printDetails();

    }
}
