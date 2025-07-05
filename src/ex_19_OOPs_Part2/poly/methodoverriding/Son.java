package ex_19_OOPs_Part2.poly.methodoverriding;

public class Son extends Father {
    void s1(){
        System.out.println("Son - s1");
    }

    @Override
    void home(){
        System.out.println("Son - 3BHK");
    }
}
