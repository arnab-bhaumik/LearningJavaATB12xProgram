package ex_18_OOPs_Constructors;

public class Lab164_Default_Cons {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Tesla 3";
        tesla.year = 2020;
        System.out.println(tesla.name);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);

    }
}
