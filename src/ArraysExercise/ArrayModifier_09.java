package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] entries = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = "";
        int index1 = -1;
        int index2 = -1;

        //Constraints
            // 1. Elements of the array will be integer numbers in the range [-2^31 to 2^31].
        for (int i = 0 ; i < entries.length  ; i++){
            if (i < Math.pow(-2,31) || i > Math.pow(2,31)){
                //ask for new inputs for the array (or return?)
                entries = Arrays.stream(scanner.nextLine()
                            .split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            }
        }
            // 2. The count of the array elements will be in the range [2...100].
        if (entries.length < 2 || entries.length > 100){
            entries = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        }

            // 3. Indexes will always be in the range of the array
        // ?????????????????

        while(true){
            String[] input = scanner.nextLine().split(" ");  //holds the command (swap/multi..) + 2 indices (could be without the indices when decreasing)
            command = input[0];
            if(input.length > 1){
                index1 = Integer.parseInt(input[1]);
                index2 = Integer.parseInt(input[2]);
            }else {
                index1 = -1;
                index2 = -1;
            }
            //check for exit
            if(command.equals("end")){
                break;
            }
            //the 3 commands
            if (command.equals("swap")){
                swap(entries,index1,index2);
            } else if (command.equals("multiply")) {
                multiply(entries,index1,index2);
            } else if (command.equals("decrease")) {
                decrease(entries);
            }
        }

        //print results
        System.out.println(Arrays.toString(entries).replace("[","").replace("]",""));
    }

    private static void swap (int[] array, int index1, int index2){
        int temp = array[index1]; // hold the value of index 1 temporarily
        array[index1] = array[index2];
        array[index2] = temp;
    }
    private static void multiply (int[] array, int index1, int index2){
        int temp = array[index1] * array[index2];
        array[index1] = temp;
    }
    private static void decrease (int[] array){
        for (int i = 0 ; i < array.length ; i++){
            array[i] -= 1;
        }
    }
}
