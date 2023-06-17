package Methods.MethodsExerciseHW;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        while(true){
            String command = scanner.nextLine();

            if (command.equals("END")){
                break;
            }else {
                int[] digit = Arrays.stream(command.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                System.out.println(isPalendrom(digit));
            }
        }
    }

    private static boolean isPalendrom (int[] num){
        // 3 2 3
        // 1 0 0 1
        // 1 0 0 0 1
        // 5 2 0 0 2 5

        //Even Digit
        int z = num.length-1;

        for (int i = 0 ; i < num.length/2; i++){
            if (num[i] != num[z]){
                return false;
            }
            z--;
        }

        //Odd digit
        return true;
    }
}
