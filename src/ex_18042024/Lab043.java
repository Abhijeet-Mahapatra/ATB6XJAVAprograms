package ex_18042024;

public class Lab043 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        double total = course + (int)GST; // GST is rounded to int after the explicit casting
        System.out.println(total);
    }
}
