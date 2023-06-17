package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class CountTheVows_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        countVows(input);
    }
    private static void countVows(String input){

        int sum = 0;

        for (int i = 0 ; i <input.length() ; i++){
            char currentChar = input.charAt(i);
            switch (currentChar){
                case 'a':
                case 'o':
                case 'e':
                case 'i':
                case 'u':
                case 'y':
                case 'A':
                case 'O':
                case 'E':
                case 'I':
                case 'U':
                case 'Y':
                    sum ++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(sum);
    }
}
