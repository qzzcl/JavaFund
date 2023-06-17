package Methods.MethodsMoreExercise;

import java.util.Scanner;

public class TribonacciSeq_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());

        tribonacciSeq(num);
    }
    private static void tribonacciSeq(int num){
        int[] tribonacci = new int[num];

        switch (num){
            case 1 :
                tribonacci[0] = 1;
                break;
            case 2 :
                tribonacci[0] = 1;
                tribonacci[1] = 1;
                break;
            case 3 :
                tribonacci[0] = 1;
                tribonacci[1] = 1;
                tribonacci[2] = 2;
                break;
            default :
                tribonacci[0] = 1;
                tribonacci[1] = 1;
                tribonacci[2] = 2;
                break;
        }

        if (num >4){
            for (int i = 0 ; i < num ; i++){
                if(i > 2){
                    tribonacci[i] = tribonacci[i-1]+tribonacci[i-2]+tribonacci[i-3];
                }
                System.out.print(tribonacci[i] + " ");
            }
        }else {
            for (int i = 0 ; i <= num-1 ; i++){
                System.out.print(tribonacci[i] + " ");
            }
        }
    }
}
