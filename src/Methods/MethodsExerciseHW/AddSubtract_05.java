package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class AddSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sumAB = addInts(a,b);
        System.out.println(subtrInts(c,sumAB));
    }
    private static int addInts(int a, int b ){
        int sum = a+b;
        return sum;
    }
    private static int subtrInts(int c, int sumAB){
        int res = sumAB-c;
        return res;
    }
}
