package may.ex_14052024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson objRef1 = new ATBPerson();
        ATBPerson objRef2 = new ATBPerson();
        ATBPerson objRef3 = null;    // This is not an object
        System.out.println(objRef1.courseName);
        System.out.println(objRef1.isMarried);
        System.out.println(objRef1.name);
        // default constructor are created to assign the value of Instance variable in the class

        ATBPerson swapnilRef = new ATBPerson();
        System.out.println(swapnilRef.name);
        System.out.println(swapnilRef.courseName);

    }
}
