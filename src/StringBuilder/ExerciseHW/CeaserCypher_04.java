package StringBuilder.ExerciseHW;

import java.util.Scanner;

public class CeaserCypher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String entryS = scanner.nextLine();

        StringBuilder encodedText = new StringBuilder();

        for (int i = 0; i < entryS.length(); i++) {
            char currentChar = entryS.charAt(i);
            int encodedCharInt = currentChar + 3;
            char encodedChar= (char) encodedCharInt;

            encodedText.append(encodedChar);
        }
            System.out.println(encodedText);
    }
}
