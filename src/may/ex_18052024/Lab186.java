package may.ex_18052024;

public class Lab186 {
    public static void main(String[] args) {
        P pRef = new P();
        pRef.m2();

    }
}

class P{
    void m1(){
        System.out.println("M1");
    }
    void m2(){
        m1();
        System.out.println("M2");
    }
}
