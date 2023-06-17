package Arrays;

import java.util.Scanner;
public class Lab_ReverseArrayStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //store an array directly from scanner console (string)
        String[] inputArrAsString = scanner.nextLine().split(" ");

        // if the array is not string we do chaining: Arrays.stream (scaner + split) -> them .mapToInt -> then .toArray
//        int[] inputArrAsInt = Arrays.stream(scanner.nextLine()
//                            .split(" "))
//                            .mapToInt(e -> Integer.parseInt(e))
//                            .toArray();

        for (int i = 0 ; i < inputArrAsString.length / 2 ; i++){
            String temp = inputArrAsString[i];
            inputArrAsString[i] = inputArrAsString[inputArrAsString.length-1-i];
            inputArrAsString[inputArrAsString.length-1-i] = temp;
        }

        for (int i = 0 ; i < inputArrAsString.length ; i++){
            System.out.print(inputArrAsString[i] + " ");
        }
        //System.out.println(Arrays.toString(inputArrAsString));
    }
}
