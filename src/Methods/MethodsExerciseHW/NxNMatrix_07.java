package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printNxNMatrix(input);
    }
    private static void printNxNMatrix(int n){
        for (int i = 0 ; i < n; i++){
            for (int z = 0 ; z <n ; z++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
