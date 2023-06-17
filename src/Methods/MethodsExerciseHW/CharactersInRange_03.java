package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();

        charactersInRange(char1.charAt(0),char2.charAt(0));
    }
    private static void charactersInRange(char char1, char char2){
        if (char1 < char2){
            for (int i = char1+1 ; i < char2 ; i++){
                char currentChar = (char)i;
                System.out.print(currentChar + " ");
            }
        }else{
            for (int i = char2+1 ; i < char1 ; i++){
                char currentChar = (char)i;
                System.out.print(currentChar + " ");
            }
        }

    }
}
