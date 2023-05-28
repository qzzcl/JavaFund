import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        boolean isTrue = (Math.abs(a - b) < eps);
        if (isTrue){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
