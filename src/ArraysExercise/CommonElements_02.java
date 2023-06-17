package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int arrSizeLarge = (input1.length > input2.length) ? input1.length : input2.length;
        int arrSizeSmall = arrSizeLarge == input1.length ? input2.length : input1.length;

        for (int i = 0 ; i < input2.length  ; i++){
            for (int z = 0 ; z < input1.length  ; z++){
                if (input2[i].equals(input1[z])){
                    System.out.print(input2[i] + " ");
                }
            }
        }
    }
}
