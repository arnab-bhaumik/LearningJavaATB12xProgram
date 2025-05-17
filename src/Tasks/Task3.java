package Tasks;

public class Task3 {
    public static void main(String[] args) {
        int N1 = 10;
        int N2 = 20;
        int N3 = 30;

        int largest = N1>N2 ? ((N1>N3)? N1 : N3) : ((N2>N3)? N2 : N3);
        System.out.println(largest);
    }
}
