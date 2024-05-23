package may.ex_14052024;

public class ATBPerson {
    // Variables

    String name;               // Instance Variables
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    // Constructor
    // default Constructor

    ATBPerson() {
        System.out.println("Hello, I will be called when you create an Object of class");
        // default Constructor
        // called when you create new object
        // It has same name as the className
        courseName = "ATB";
    }

    public ATBPerson(String name) {
        this.name = name;
    }

    public ATBPerson(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    public ATBPerson(String name, long phone, String email, boolean isMarried, String courseName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.courseName = courseName;
    }

    void ATBPerson(){
        {    // This is a normal method, not constructor
            System.out.println("Hello");
        }
    }



    void printDetails(){
//        int age = 10;   // local variable
//        System.out.println(age);
        System.out.println("Printing details of the student");
    }
}
