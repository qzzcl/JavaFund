package Arrays;

import java.util.Scanner;
import java.util.Arrays;

//NOT COMPLETED
public class Lab_CondenseArrayToNum_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] condensed= new int[input.length-1];

        for (int i = 0 ; i <input.length ; i++){
            //cover scenario where the input is a single digit
            if (input.length == 1){
                break;
            }
            //cover last i scenario
            if (i == input.length-1){
                int[] condensed3 = new int[condensed.length-1];
                i = -1;
                input = condensed;
                condensed = condensed3;
            }else{
                condensed[i] = input[i]+input[i+1];
            }
        }
        System.out.println(input[0]);
    }
}
