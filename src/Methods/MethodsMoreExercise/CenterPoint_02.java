package Methods.MethodsMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        int[] res = closestXYto00();
        System.out.println(Arrays.toString(res).replace("[","(").replace("]",")"));
    }
    private static int[] closestXYto00(){
        Scanner scanner = new Scanner (System.in);
        int[] pointsArrBoth = new int[4];

        //fill array from scanner
        for (int i = 0 ; i < pointsArrBoth.length ; i++){
            //int temp = Integer.parseInt(scanner.nextLine());
            pointsArrBoth[i] = Integer.parseInt(scanner.nextLine());
        }

        //find highest single digit among the 2 groups and store its index
        int largest = 0;
        int largestIdx = 0;
        for (int i = 0 ; i <pointsArrBoth.length ; i++){
            if (largest < Math.abs(pointsArrBoth[i])){
                largestIdx = i;
                largest = Math.abs(pointsArrBoth[i]);
            }
        }

        //if highest index is 0 or 1, 2nd group is closest to 0,0
        int[] res = new int[2];
        if (largestIdx < 2){
            res[0] = pointsArrBoth[2];
            res[1] = pointsArrBoth[3];
        }else {
            res[0] = pointsArrBoth[0];
            res[1] = pointsArrBoth[1];
        }
        return res;
    }
}
