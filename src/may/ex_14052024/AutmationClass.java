package may.ex_14052024;

public class AutmationClass {
    String name;

    AutmationClass(){
        dataBaseConnection();
        excelOpen();
    }

    public AutmationClass(String name) {
        this.name = name;
    }

    void dataBaseConnection(){
        System.out.println("Mysql Connection is created");
    }
    void testcase1(){
        System.out.println("testcase1" +this.name);
    }
    void testcase2(){
        System.out.println("testcase2" +this.name);
    }

    void excelOpen() {
        System.out.println("Excel Opened");
    }

    public static void main(String[] args) {
        AutmationClass tc1 = new AutmationClass("TC1");
        AutmationClass tc2 = new AutmationClass("TC2");
        System.out.println(tc1.name);
        tc1.testcase1();
        tc1.testcase2();
        System.out.println(tc2.name);
        tc2.testcase1();
        tc2.testcase2();
    }
}
