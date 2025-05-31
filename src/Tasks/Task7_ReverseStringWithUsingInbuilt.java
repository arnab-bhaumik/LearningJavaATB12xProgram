package Tasks;

import java.util.Scanner;

public class Task7_ReverseStringWithUsingInbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input value: ");
        String input = sc.nextLine();

        StringBuffer Str = new StringBuffer();
        Str.append(input);
        Str.reverse();
        System.out.println("Reverse of the string:"+" "+ Str);
    }
}
