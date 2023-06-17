package Methods.MethodsLab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String command = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add" :
                add(n1, n2);
                break;
            case "multiply" :
                multiply(n1 , n2);
                break;
            case "subtract" :
                subtract(n1, n2);
                break;
            case "divide" :
                divide(n1, n2);
                break;
            default :
                break;
        }
    }

    private static void add (int digitOne, int digitTwo){
        System.out.println(digitOne + digitTwo);
    }
    private static void multiply (int digitOne, int digitTwo){
        System.out.println(digitOne * digitTwo);
    }
    private static void subtract (int digitOne, int digitTwo){
        System.out.println(digitOne - digitTwo);
    }
    private static void divide (int digitOne, int digitTwo){
        System.out.println(digitOne / digitTwo);
    }
}
