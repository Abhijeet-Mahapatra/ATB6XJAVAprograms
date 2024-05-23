package may.ex_02052024_HomeWork;

public class Lab003 {
    public static void main(String[] args) {
        // Find the max salary in the input arrays {30,50,60,90,10, 100,999}

        int[] salaries = {30, 50, 60, 90, 10, 100, 999};
        int max_salary = Integer.MIN_VALUE;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max_salary){
                max_salary = salaries[i];
            }
        }
        System.out.println("Max Sal -> " + max_salary);
    }
}
