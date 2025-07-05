package ex_18_OOPs_Constructors;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();

    }
}
class Baby{
    String name;

    Baby() {
        // This is called automatically when object is created.
        System.out.println("I am called. Object is created");
    }
}


