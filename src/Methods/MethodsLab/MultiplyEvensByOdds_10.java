package Methods.MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(multSumOdds(input));
    }

    private static int multSumOdds(int n){
        return extractSumOdds(n) * extractSumEvens(n);
    }
    private static int extractSumEvens(int input){
        int sum = 0;
        input = input < 0 ? input * (-1) : input;
        while (input > 0){
            //step 1 - extract last digit
            int lastDigit = input % 10;
            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }

            //step 2 - remove last digit
            input /= 10;
        }
        return sum;
    }
    private static int extractSumOdds(int input){
        int sum = 0;
        input = input < 0 ? input * (-1) : input;
        while (input > 0){
            //step 1 - extract last digit
            int lastDigit = input % 10;
            if (lastDigit % 2 != 0){
                sum += lastDigit;
            }

            //step 2 - remove last digit
            input /= 10;
        }
        return sum;
    }
}
