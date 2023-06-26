package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheAngyCat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputS = scanner.nextLine();
        List<Integer> pricesItemsList = Arrays
                .stream(inputS.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int middleIndex = Integer.parseInt(scanner.nextLine());     //index in the list
        int valueToComp = pricesItemsList.get(middleIndex);

        String cheapExp = scanner.nextLine();

        //count left
        int sumLeft = 0;
        for (int i = 0 ; i < middleIndex ; i++){
            int currEle = pricesItemsList.get(i);

            if(cheapExp.contains("cheap")){
                if (currEle < valueToComp){
                    sumLeft += currEle;
                }
            }else{
                if (currEle >= valueToComp){
                    sumLeft += currEle;
                }
            }
        }

        //count right
        int sumRight=0;
        for (int i = middleIndex+1 ; i < pricesItemsList.size() ; i++){
            int currEle = pricesItemsList.get(i);
            if(cheapExp.contains("cheap")){
                if (currEle < valueToComp){
                    sumRight += currEle;
                }
            }else{
                if (currEle >= valueToComp){
                    sumRight += currEle;
                }
            }
        }

        if(sumRight > sumLeft){
            System.out.printf("Right - %d",sumRight);
        }else{
            System.out.printf("Left - %d",sumLeft);
        }

    }
}
