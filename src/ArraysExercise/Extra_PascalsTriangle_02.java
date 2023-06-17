package ArraysExercise;

import java.util.Scanner;

public class Extra_PascalsTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numRows = Integer.parseInt(scanner.nextLine());

        

        for (int row = 0; row < numRows; row++) {
            int numElements = row + 1;
            int element = 1;

            // Print each element in the current row
            for (int i = 0; i < numElements; i++) {
                System.out.print(element + " ");

                // Calculate the next element in the row
                element = element * (row - i) / (i + 1);
            }

            System.out.println(); // Move to the next row
        }
    }
}

/*

    1
    1 + 1 (1+0)
    1 + 2 (1+1) + 1
    1 + 3 (2+1) + 3 (2+1) + 1
    1 + 4 (3+1) + 6 (3+3) + 4 (3+1) + 1
 */