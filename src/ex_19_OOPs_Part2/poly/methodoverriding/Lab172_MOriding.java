package ex_19_OOPs_Part2.poly.methodoverriding;

public class Lab172_MOriding {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.home();
        s1.s1();

        Father f1 = new Father();
        f1.home();

        Father f11 = new Son();
        f11.home();
    }
}
