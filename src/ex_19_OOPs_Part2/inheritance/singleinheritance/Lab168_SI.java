package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son S1 = new Son();
        S1.BHK3();
        S1.BHK2();
        System.out.println(S1.gold_f);

        Cousin C1 = new Cousin();
        C1.BHK1();
        //C1.BHK2();
    }
}
