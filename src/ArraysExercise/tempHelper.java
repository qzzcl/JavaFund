package ArraysExercise;

import java.util.Scanner;

public class tempHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String entry = scanner.nextLine();

        for (int i = 0 ; i < entry.length(); i++){
            char currentChar = entry.charAt(i);
            System.out.println(currentChar);
        }
    }
}
