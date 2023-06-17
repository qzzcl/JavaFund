package Lists.ListsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputS = scanner.nextLine();
        List<Integer> listNum = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*
        //remove negatives -loop
        for (int i = 0 ; i < listNum.size() ; i++){
            if(listNum.get(i) < 0){
                listNum.remove(i);
                i--;
            }
        }
        */

        //solution 2 - using lambda expression
        listNum.removeIf(e -> e < 0);

        //reverse what's remaining
        Collections.reverse(listNum);

        //print
        if(listNum.size() > 0){
            System.out.println(listNum.toString().replace("[","").replace("]","").replace(",",""));
        }else {
            System.out.println("empty");
        }
    }
}
