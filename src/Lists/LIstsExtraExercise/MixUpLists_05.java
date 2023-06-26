package Lists.LIstsExtraExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixUpLists_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputL1 = scanner.nextLine();
        String inputL2 = scanner.nextLine();

        List<Integer> listOne = Arrays
                .stream(inputL1.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> listTwo = Arrays
                .stream(inputL2.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //remove last 2 elements from the larger list to work with equal sized lists
        int minValue = 0;
        int maxValue = 0;

        //reverse second list
        Collections.reverse(listTwo);

        if (listOne.size() > listTwo.size()){
            minValue = listOne.get(listOne.size()-1);
            maxValue = listOne.get(listOne.size()-2);
            listOne.remove(listOne.size()-1);
            listOne.remove(listOne.size()-1);

        }else{
            minValue = listTwo.get(listTwo.size()-1);
            maxValue = listTwo.get(listTwo.size()-2);
            listTwo.remove(listOne.size()-1);
            listTwo.remove(listOne.size()-1);
        }

        //make a new mixed list
        List<Integer> mixedList = new ArrayList<>();
        for (int i = 0 ; i < listOne.size(); i++){
            mixedList.add(listOne.get(i));
            mixedList.add(listTwo.get(i));
        }

        //remove elements that are not within the start/end index
        int tempStartIdx = minValue;
        minValue = Math.min(minValue,maxValue);
        maxValue = Math.max(tempStartIdx,maxValue);

        for (int i = 0 ; i < mixedList.size() ; i++){
            int currentE = mixedList.get(i);

            //if withtin the allowed range, continue, if not remove from list
            if (currentE > minValue && currentE < maxValue ){
                continue;
            }else{
                mixedList.remove(i);
                i--;
            }
        }

        Collections.sort(mixedList);

        System.out.println(mixedList.toString()
                    .replace("[","")
                    .replace("]","")
                    .replace(",",""));
    }
}
