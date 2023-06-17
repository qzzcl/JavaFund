package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] inputsA = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumInput = Integer.parseInt(scanner.nextLine());

        for (int z = 0 ; z < inputsA.length  ; z++){
            for (int i = z+1 ; i < inputsA.length ; i++){
                //need another check to avoid duplicates
                int sumCurrent = inputsA[z] + inputsA[i];
                if (sumCurrent == sumInput){
                    System.out.println(inputsA[z] + " " + inputsA[i]);
                }
            }
        }
    }
}
