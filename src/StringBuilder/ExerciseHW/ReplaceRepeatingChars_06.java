package StringBuilder.ExerciseHW;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        StringBuilder entryS = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < entryS.length()-1; i++) {
            char currentChar = entryS.charAt(i);
            char nextChar = entryS.charAt(i+1);

            if(currentChar == nextChar){
                entryS.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(entryS);
    }
}
