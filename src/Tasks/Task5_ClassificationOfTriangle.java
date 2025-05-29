package Tasks;

import java.util.Scanner;

public class Task5_ClassificationOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the side of the triangle");

        Scanner sc = new Scanner(System.in);
        System.out.print("N1 = ");
        int N1  = sc.nextInt();
        System.out.print("N2 = ");
        int N2 = sc.nextInt();
        System.out.print("N3 = ");
        int N3  = sc.nextInt();

        if (N1==N2 && N2==N3){
            System.out.println("The given Triangle is equilateral");
        } else if (N1==N2 || N1==N3 || N2==N3) {
            System.out.println("The given Triangle is Isosceles.");
        }
        else{
            System.out.println("The given Triangle  is Scalene.");
        }
    }
}
