package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] inputs = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counterLargest= 0;
        int counterCurrent =0;
        int digit = 0;

        //get the longest seq of identical elements
        for (int i = 0 ; i < inputs.length  ; i++){
            if (i < inputs.length-1){
                if (inputs[i] == inputs[i+1] ){
                    counterCurrent++;
                }else {
                    counterCurrent =0;
                }
            }

            if (counterLargest < counterCurrent){
                counterLargest = counterCurrent;
                digit = inputs[i];
            }
        }

        // !!! important - add +1 to counterLargest when printing because the counter registers a sequence pair (2, 2) as 1. So the count is always -1 based on the counter.
        for (int i = 0 ; i < counterLargest+1  ; i++){
            System.out.print(digit + " ");
        }
        int i = 0;
    }
}

