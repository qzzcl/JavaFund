package Lists.ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEquals_01 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       String inputS = scanner.nextLine();

       //parse the entry to integer list
        List<Double> listDouble = Arrays
                .stream(inputS.split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        calcAdj(listDouble);
        DecimalFormat df = new DecimalFormat("0.#");

        for (double e : listDouble){
            System.out.print(df.format(e) + " ");
        }

    }
    private static void calcAdj (List<Double> intList){
        int listSize = intList.size();
        for (int i = 0 ; i < listSize-1; i++){
            double current = intList.get(i);
            double next = intList.get(i+1);

            if (current == next){
                intList.set(i,current+next);
                intList.remove(i+1);
                i = -1;
                listSize = intList.size();
            }
        }
    }
}

