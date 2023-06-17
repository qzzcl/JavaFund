package Methods.MethodsLab;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double input = Double.parseDouble(scanner.nextLine());

        System.out.println(grades(input));
    }
    private static String grades (double input){
        String grade ="";
        grade = input < 2.99 ? "Fail" :
                input < 3.49 ? "Poor" :
                input < 4.49 ? "Good" :
                input < 5.49 ? "Very Good" :
                input < 6.00 ? "Excellent" : grade ;

        return grade;
    }
}
