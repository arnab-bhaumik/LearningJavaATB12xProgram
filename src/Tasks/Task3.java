package Tasks;

public class Task3 {
    public static void main(String[] args) {
        int N1 = 20;
        int N2 = 30;
        int N3 = 40;

        int largest = N1>N2 ? ((N1>N3)? N1 : N3) : ((N2>N3)? N2 : N3);
        System.out.println(largest);
    }
}
