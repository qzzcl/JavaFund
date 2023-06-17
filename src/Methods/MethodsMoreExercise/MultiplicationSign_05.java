package Methods.MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {

        int res = multiplicationSing();
        if (res == 0){
            System.out.println("zero");
        } else if (res > 0) {
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }

    }
    private static int multiplicationSing (){
        Scanner scanner = new Scanner (System.in);
        int[] input = new int[3];

        for (int i = 0 ; i < input.length; i++){
         input[i]= Integer.parseInt(scanner.nextLine());
        }

        int res = 1;
        //highest in order is 0. if zero is found in the array break
        for (int i = 0 ; i < 3 ; i++){
            if (input[i] == 0){
                res = 0;
                return res;
            }
        }

        //next in order is negative.
        for (int i = 0 ; i < 3 ; i++){
            if (input[i] < 0){
                res = -1;
                return res;
            }
        }
        return res;
    }
}
