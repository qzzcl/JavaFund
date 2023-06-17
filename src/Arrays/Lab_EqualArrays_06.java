package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Lab_EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] inputArr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] inputArr2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        for (int i = 0 ; i < inputArr1.length; i++){
            sum += inputArr1[i];
            if (inputArr1[i] != inputArr2[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }else if (i == inputArr1.length-1){
                System.out.printf("Arrays are identical. Sum: %d",sum);
            }
        }

    }
}
