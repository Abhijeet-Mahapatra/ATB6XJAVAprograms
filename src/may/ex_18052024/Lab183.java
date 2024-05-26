package may.ex_18052024;

public class Lab183 {
    public static void main(String[] args) {
        Student1 sc1 = new Student1();
        // If child has DC -> parent class DC will be called by default internally
        // super() automatically in Java
    }
}

class Person1{
    Person1(){
        System.out.println("Person1 - DC");
    }
}

class Student1 extends Person1{
    Student1(){
        System.out.println("Student1 - DC");
    }
}
