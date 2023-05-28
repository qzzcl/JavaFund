package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_SumEvenNum_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int sum =0;
        String input = scanner.nextLine();
        String[] inputA = input.split(" ");

        /*
        //solution 1 - regular loop solution
        for (int i = 0 ; i < inputA.length; i++){
            int element = Integer.parseInt(inputA[i]);
            //check if odd/even
            if (element % 2 == 0){
                sum += element;
            }
        }
*/

        //solution 2 - enhanced loop  - grab every number from the string array and calc sum if even.
        // In case of extra space in the input it breaks.
        int num = 0;
        for (String element : inputA){
            num = Integer.parseInt(element);
            //check if odd/even
            if (num % 2 == 0){
                sum += num;
            }
        }


         /*
        //solution 3- parse the string array to int array
        // In case of extra space in the input it breaks.
        int num = 0;
        int[] numbersArrayFromInput = new int[inputA.length];
        for (int i = 0 ; i < inputA.length; i++){
            numbersArrayFromInput[i]= Integer.parseInt(inputA[i]);
            //check if odd/even
            if (num % 2 == 0){
                sum += num;
            }
        }
         */

        //solution 4 - using stream and mapping to convert the string array to int array

        //4.1 - using lambda
        int[] numArFromInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        //4.2 - method reference
        int[] numArFromInput2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sum);
    }
}
