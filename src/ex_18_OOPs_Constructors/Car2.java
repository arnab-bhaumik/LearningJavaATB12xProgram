package ex_18_OOPs_Constructors;

public class Car2 {
    String name;
    int year;
    String model;

    Car2() {
        name = "Unknown Car";
        year = 0;
        model = "XXXX";
    }

    public Car2(int year, String name, String model) {
        this.year = year;
        this.name = name;
        this.model = model;
    }

    public Car2(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
