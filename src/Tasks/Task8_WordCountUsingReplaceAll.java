package Tasks;

import java.util.Scanner;

public class Task8_WordCountUsingReplaceAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        input = input.trim().replaceAll("\\s", " ");
        String[] words = input.split(" ");
        System.out.println("Word count: " + words.length);
    }
}
