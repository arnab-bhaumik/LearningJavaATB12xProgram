package ex_19_OOPs_Part2.poly.methodoverloading;

public class Lab171_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();

        int result = m1.add(2,5);
        System.out.println(result);

        int result1 = m1.add(4,5,8);
        System.out.println(result1);

        double result2 = m1.add(23.3,56.5);
        System.out.println(result2);
    }
}
