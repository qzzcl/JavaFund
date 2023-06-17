package ArraysExercise;

import java.util.Scanner;

public class Extra_RecursiveFibo_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int fibonacciNumber = getFibonacci(n);
        System.out.println(fibonacciNumber);
    }

    public static int getFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
