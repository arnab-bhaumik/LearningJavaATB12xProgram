package Tasks;

import java.util.Scanner;

public class Task10_FirstLetterEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        input = input.trim().replaceAll("\\s", " ");

        for (String word : input.split(" ")) {
            System.out.print(word.charAt(0) + " ");
        }
    }
}
