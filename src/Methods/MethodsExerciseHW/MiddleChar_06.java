package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class MiddleChar_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        middleChar(input);

    }
    private static void middleChar (String input) {
        //check if odd or even num of chars
        int len = input.length();
        if (len % 2 == 0){
            char char1 = input.charAt(input.length()/2);
            char char2 = input.charAt((input.length()/2)-1);
            System.out.print(char2);
            System.out.print(char1);

        }else{
            char char1 = input.charAt(input.length()/2);
            System.out.println(char1);
        }
    }
}
