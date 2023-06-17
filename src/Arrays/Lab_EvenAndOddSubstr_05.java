package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Lab_EvenAndOddSubstr_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sumOdd =0;
        int sumEven =0;
        for (int i = 0 ; i <input.length ; i++){
            int current = input[i];

            if (current % 2 == 0){
                sumEven += current;
            }else {
                sumOdd += current;
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
