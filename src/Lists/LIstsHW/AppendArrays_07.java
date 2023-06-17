package Lists.LIstsHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//THIS SOLUTION DOESN'T WORK IN JIRA
public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //strip down arrays
        List<String> listArrays = Arrays
                .stream(input.split("\\s*\\|\\s*"))
                //.map(Integer::parseInt)
                .collect(Collectors.toList());

        int arraysCount = listArrays.size();
        List<List<Integer> > listOfLists = new ArrayList<>();

        for (int i = 0 ; i < arraysCount ; i++){
            List<Integer> listInt = Arrays
                    .stream(listArrays.get(i).split(" "))
                    .filter(s -> !s.isEmpty())
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            listOfLists.add(listInt);
        }

        int i = 0;
        for (i = listOfLists.size()-1 ; i >= 0; i--){
            List<Integer> innerList = listOfLists.get(i);
            //System.out.println("Inner list at index " + i + ": " + innerList);

            for (int j = 0; j < innerList.size(); j++) {
                int element = innerList.get(j);
                if(i == 0 && j == innerList.size()-1){
                    System.out.print(element);
                }else{
                    System.out.print(element+" ");
                }

            }
        }
    }
}
