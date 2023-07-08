package StringBuilder.ExerciseHW;

import java.util.Scanner;

public class CharMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputS = scanner.nextLine().split(" ");

        manipulateChars(inputS[0],inputS[1]);

    }
    public static void manipulateChars (String input1, String input2){
        int sum = 0;
        int shorterString = Math.min(input1.length(),input2.length());

        for (int i = 0; i < shorterString ; i++) {
            char char1 = input1.charAt(i);
            char char2 = input2.charAt(i);
            sum += char1 * char2;
        }
        int sizeLargerString = Math.max(input1.length(),input2.length());
        String largerStr = input1.length() > input2.length() ? input1 : input2;

        for (int i = shorterString; i < sizeLargerString  ; i++) {
            char char1 = largerStr.charAt(i);
            sum += char1;
        }

        System.out.println(sum);
    }
}
