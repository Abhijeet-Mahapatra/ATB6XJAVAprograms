package ex_18042024;

public class Lab042 {
    public static void main(String[] args) {

        int a1 = 300;
        byte b1 = (byte) a1; // Explicit Casting
        System.out.println(b1);

        // 300 -> 32 bits  00000000000000000000000100101100 - 300 in Decimal
        // byte - 8 bits 00101100 - 44 in Decimal , So the above code result will show 44 instead of 300 due to explicit Casting is done to convert it to byte which supports 8 bits and integer supports 32 bits
    }
}
