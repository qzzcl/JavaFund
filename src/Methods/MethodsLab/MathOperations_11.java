package Methods.MethodsLab;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int digit1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int digit2 = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d",mathCalc(digit1,operator,digit2));

    }
    private static int mathCalc(int n1 ,String operator, int n2){
        int sum = 0;
        switch (operator){
            case "/" :
                sum = n1 / n2;
                break;
            case "*" :
                sum = n1 * n2;
                break;
            case "+" :
                sum = n1 + n2;
                break;
            case "-" :
                sum = n1 - n2;
                break;
            default :
                break;
        }
        return sum;
    }
}
