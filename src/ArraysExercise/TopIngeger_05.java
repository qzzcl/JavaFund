package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIngeger_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0 ; i < inputs.length  ; i++){
            boolean isTop = true;
            for (int z = i+1 ; z < inputs.length   ; z++){
                if (inputs[i] < inputs[z]){
                    isTop = false;
                    break;
                }
            }
            if(isTop){
                System.out.print(inputs[i] + " ");
            }
        }
    }
}
