package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class TopNumer_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] input = Arrays.stream(scanner.nextLine().split(""))
//                .mapToInt(Integer::parseInt)
//                .toArray();

        //50 -> int[] input = [5,0]
        int entry = Integer.parseInt(scanner.nextLine());
        for (int i = 1 ; i <= entry ; i++){
            if (isDivByEight(i) && holdsOddDigit(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isDivByEight(int input){
        int sum =0;
        int[] numArr = intToArray(input);

        //check if the sum of the current digit's elements is divisible by 8
        for (int i = 0 ; i <numArr.length ; i++){
            sum += numArr[i];
        }
        if (sum % 8 == 0 && sum != 0){
            return true;
        }
        return false;
    }
    private static boolean holdsOddDigit(int n){
        int[] numArr = intToArray(n);

        for (int i = 0 ; i <numArr.length ; i++){
            if (numArr[i] % 2 != 0){
                return true;
            }
        }
        return false;
    }

    private static int[] intToArray(int digit){
        //convert the input to string so we can break it down into individual ints
        String[] inputArrDig = Integer.toString(digit).split("");
        int[] numArr = new int[inputArrDig.length];
        //fill the int array with the values from String Array for further work
        for (int i = 0 ; i < numArr.length ; i++){
            numArr[i] = Integer.parseInt(inputArrDig[i]);
        }
        return numArr;
    }
}
