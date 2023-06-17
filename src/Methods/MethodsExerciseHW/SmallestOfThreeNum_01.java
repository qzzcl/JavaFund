package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class SmallestOfThreeNum_01 {
    public static void main(String[] args) {
        smallestOfThreeNum();
    }
    private static void smallestOfThreeNum(){
        Scanner scanner = new Scanner (System.in);
        int smallest = 0;
        int input=0;
        for (int i = 0 ; i < 3; i++){
            input = Integer.parseInt(scanner.nextLine());
            if (i == 0){
                smallest = input;
            }else {
                smallest = input < smallest ? input : smallest;
            }
        }

        System.out.println(smallest);

    }
}
