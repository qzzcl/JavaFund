package Lists.LIstsExtraExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> leftList = listInts.subList(0,listInts.size()/2);
        List<Integer> rightList = listInts.subList(listInts.size()/2 + 1,listInts.size());
        Collections.reverse(rightList);

        double sumLeft = 0;
        double sumRight = 0;

        for (int i = 0 ; i < leftList.size() ; i++){
            int currentLeft = leftList.get(i);
            int currentRight = rightList.get(i);

            if (currentLeft == 0 && sumLeft > 0){
                sumLeft *= 0.8;
            }else{
                sumLeft += currentLeft;
            }
            if (currentRight == 0 && sumRight > 0){
                sumRight *= 0.8;
            }else{
                sumRight += currentRight;
            }
        }
        if (sumLeft < sumRight){
            System.out.printf("The winner is left with total time: %.1f",sumLeft);
        }else if(sumLeft > sumRight) {
            System.out.printf("The winner is right with total time: %.1f",sumRight);
        }else{
            System.out.printf("The winner is left with total time: %.1f",sumLeft);
        }
    }
}
