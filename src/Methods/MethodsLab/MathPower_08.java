package Methods.MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double digit = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        mathPower(digit,power);
    }
    private static double mathPower (double digit, double power){
        double res = 0;
        DecimalFormat df = new DecimalFormat("0.####");
        res = Math.pow(digit,power);
        System.out.println(df.format(res));
        return res;
    }
}
