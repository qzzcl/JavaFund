package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //MY SOLUTION
        /*
        int[] numA =  Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        int nRotations = Integer.parseInt(scanner.nextLine());
        int[] rotatedA = new int[numA.length];

        int lastE = 0;
        for (int i = 0 ; i < nRotations  ; i++){
            for (int z= 0 ; z< numA.length  ; z++){
                if(z == 0){
                    lastE = numA[z];
                }
                if (z == numA.length-1){
                    rotatedA[numA.length-1] = lastE;
                }else{
                    rotatedA[z]=numA[z+1];
                }
            }
            //update the orginal Arr, so we can rotate again on the next iteration
            numA = rotatedA;
        }
        for (int el : numA){
            System.out.print(el + " ");
        }

         */


        //SOLUTION BY DESI

        String[] inputs = scanner.nextLine()
                .split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());


        for (int z = 0 ; z < rotations  ; z++){
            // 1. save first element in a temp var
            String temp = inputs[0];

            // 2. shift all elements by 1, to the left
            //the for loop runs to last-1, not to the last
            for (int i = 0 ; i < inputs.length-1  ; i++){
                inputs[i] = inputs[i+1];
            }

            // 3. assign the temp var to the last position
            inputs[inputs.length-1] = temp;
        }
        for (String e : inputs){
            System.out.print(e + " ");
        }

    }
}
