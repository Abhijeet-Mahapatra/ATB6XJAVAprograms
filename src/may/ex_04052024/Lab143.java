package may.ex_04052024;

public class Lab143 {
    public static void main(String[] args) {
        String s1 = "Pramod";              // Stored in String constant pool
        String s2 = new String("Pramod");  // Stored in object area

        // String is Immutable -> once created can't be changed
        // But StringBuffer can be changed

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        // PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Dutta");

        String password = "pass@123";
        password = "123";         // in case of String here 2 objects will be present in String constant pool

        // But in case of StringBuffer / StringBuffer it will one object as they mutable in nature

        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append("Dutta");
        System.out.println(password2);
    }
}
