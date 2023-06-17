package ArraysExercise;

import java.util.Scanner;
import java.util.Arrays;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[n];

        for (int i = 0 ; i < n  ; i++){
            int[] arrayHelper = new int[2];
            arrayHelper = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            if (i % 2 == 0){
                arrayOne[i] = arrayHelper[0];
                arrayTwo[i] = arrayHelper[1];
            }else{
                arrayOne[i] = arrayHelper[1];
                arrayTwo[i] = arrayHelper[0];
            }
        }
        for (int i = 0 ; i < n  ; i++){
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < n  ; i++){
            System.out.print(arrayTwo[i]+ " ");
        }
    }
}
