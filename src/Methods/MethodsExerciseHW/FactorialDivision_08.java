package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        double res = factorialDiv(calcFactorial(n1), calcFactorial(n2));
        System.out.printf("%.2f%n",res);
    }
    private static int factorialDiv(int n1Factorial, int n2Factorial){
        int res = n1Factorial / n2Factorial;

        return res;
    }

    private static int calcFactorial(int n){
        int factorialN = 1;

        for (int i = n ; i >0 ; i--){
            factorialN *= i;
        }
        return factorialN;
    }


}
