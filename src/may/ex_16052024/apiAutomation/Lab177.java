package may.ex_16052024.apiAutomation;

public class Lab177 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.openSQLConnection();
        t1.openExcelFile();
        int a = t1.API_VERSION;

        CommonToAll c = new Test();
        c.openExcelFile();
        c.openJSON();
    }
}
