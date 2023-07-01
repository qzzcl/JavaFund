package AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurances_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine().toLowerCase();
        String [] inputArr = inputS.split(" ");

        LinkedHashMap<String,Integer> mapWords = new LinkedHashMap<>();

        int i = 1;
        for (String element : inputArr){
            //if not present -add it to the map
            if(!mapWords.containsKey(element)){
                mapWords.put(element,1);
            }else{
                //int valueOfKey = mapWords.get(element);
                mapWords.put(element,mapWords.get(element)+1);
            }
        }

        ArrayList<String> finalList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapWords.entrySet()) {
            if (entry.getValue() % 2 != 0 ){
                finalList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", finalList));
    }
}
