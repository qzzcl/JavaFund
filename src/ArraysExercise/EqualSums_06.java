package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] inputs = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean printNo = true;

        for (int i = 0 ; i < inputs.length  ; i++){
            int sumLeft = 0;
            int sumRight= 0;

            // sum left excluding current
            if(i == 0){
                sumLeft = 0;
            }else{
                for (int z = 0 ; z < i   ; z++){
                    sumLeft += inputs[z];
                }
            }

            //sum right excluding current
            if(i == inputs.length-1){                           //cover situation when we are at the last index
                sumRight = 0;
            }else{
                for (int y = i+1 ; y < inputs.length ; y++){
                    sumRight += inputs[y];
                }
            }

            if (sumLeft == sumRight){
                System.out.println(i);
                printNo = false;
            }
        }
        if(printNo){
            System.out.println("no");
        }

    }
}
