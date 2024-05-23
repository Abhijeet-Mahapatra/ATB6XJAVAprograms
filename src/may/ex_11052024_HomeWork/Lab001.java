package may.ex_11052024_HomeWork;

public class Lab001 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "Abhijeet";
        student1.mobileNumber = 7848056403L;
        student1.emailID = "abhi.jsr305@gmail.com";
        student1.age = 33;

        Student student2 = new Student();
        student2.studentName = "Suresh";
        student2.mobileNumber = 7848056111L;
        student2.emailID = "abhi.jsr111@gmail.com";
        student2.age = 34;

        Student student3 = new Student();
        student3.studentName = "Ramesh";
        student3.mobileNumber = 7848056222L;
        student3.emailID = "abhi.jsr222@gmail.com";
        student3.age = 35;

        Course course1 = new Course();
        course1.nameOfCourse = "Automation Testing";
        Course course2 = new Course();
        course2.nameOfCourse = "Manual Testing";
        Course course3 = new Course();
        course3.nameOfCourse = "ATBX06";

        course1.dateOfEnrol = "02/04/24";
        course2.dateOfEnrol = "03/04/24";
        course3.dateOfEnrol = "04/04/24";

        Payment payment1 = new Payment();
        Payment payment2 = new Payment();
        Payment payment3 = new Payment();

        payment1.modeOfPayment = "Credit Card";
        payment1.amountPaid = 9999;
        payment2.modeOfPayment = "Debit Card";
        payment2.amountPaid = 10000;
        payment3.modeOfPayment = "UPI";
        payment3.amountPaid = 10100;

        student1.studentName();
        student1.studentMobileNumber();
        student1.studentEmailId();
        student1.studentAge();

        payment1.successfulPayment();
        course1.enrolled();

        student2.studentName();
        student2.studentMobileNumber();
        student2.studentEmailId();
        student2.studentAge();

        payment2.successfulPayment();
        course2.enrolled();

        student3.studentName();
        student3.studentMobileNumber();
        student3.studentEmailId();
        student3.studentAge();

        payment3.successfulPayment();
        course3.enrolled();


    }
}
