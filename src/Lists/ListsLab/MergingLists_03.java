package Lists.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS1 = scanner.nextLine();
        String inputS2 = scanner.nextLine();

        List<Integer> listInt1 = Arrays
                .stream(inputS1.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> listInt2 = Arrays
                .stream(inputS2.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mergedList = mergeLists(listInt1,listInt2);
        for (int e :mergedList ){
            System.out.print(e + " ");
        }
    }
    private static List<Integer> mergeLists (List<Integer> listInt1 , List<Integer> listInt2){
        List<Integer> mergedList = new ArrayList<>();
        int largerListSize = Math.max(listInt1.size(), listInt2.size());

        for (int i = 0 ; i <largerListSize ; i++){
            if(i <= listInt1.size()-1){
                mergedList.add(listInt1.get(i));
            }
            if(i <= listInt2.size()-1){
                mergedList.add(listInt2.get(i));
            }
        }
        return mergedList;
    }
}
