package ex_18_OOPs_Constructors;

public class Lab165_Parameterized_Const {
    public static void main(String[] args) {
        Car2 tesla = new Car2(2024,"Tesla","Tesla 4");
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        Car2 nano = new Car2("Nano",2011);
        System.out.println(nano.name);
        System.out.println(nano.model);

        Car2 c1 = new Car2();
        System.out.println(c1.model );

    }
}
