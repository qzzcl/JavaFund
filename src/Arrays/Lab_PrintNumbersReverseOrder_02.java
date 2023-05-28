package Arrays;

import java.util.Scanner;

public class Lab_PrintNumbersReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int[] numbA = new int[input];
        for (int i = 0 ; i < input ; i++){
            numbA[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numbA.length-1 ; i >= 0 ; i--){
            System.out.print(numbA[i] + " ");
        }
    }
}




