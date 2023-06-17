package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HowToReadArrayFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //store an array directly from scanner console (string)
        String[] inputArrAsString = scanner.nextLine().split(" ");

        // if the array is not string we do chaining: Arrays.stream (scaner + split) -> them .mapToInt -> then .toArray
        int[] inputArrAsInt = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        System.out.println(Arrays.toString(inputArrAsString));
    }
}
