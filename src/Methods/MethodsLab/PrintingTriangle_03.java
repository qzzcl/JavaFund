package Methods.MethodsLab;

import java.util.Scanner;

public class PrintingTriangle_03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printTriangle(input);

    }

    public static void printTriangle(int n) {
        // Print upper triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print lower triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
