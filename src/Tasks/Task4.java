package Tasks;

public class Task4 {
    public static void main(String[] args) {
        int age = 54;
        String result = (age < 18) ? "Minor" : ((age>65) ? "Senior" : "Adult");
        System.out.println(result);
    }
}
