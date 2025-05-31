package Tasks;

import java.util.Scanner;

public class Task6_ReverseStringWithoutUsingInbuilt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input value: ");
        String str = sc.nextLine();
        String reversed = "";

        for (int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        System.out.print("reverse of the string:"+" "+ reversed);

    }
}

