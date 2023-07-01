package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNums_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        double[] inputDArr = Arrays
                .stream(inputS.split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> counter = new TreeMap<>();

        //loop thru the entries and add em to the treemap
        for (double digit: inputDArr) {
            //if the current element doesn't exist in the map, add it
            if(!counter.containsKey(digit)){
                counter.put(digit,0);
            }
            //otherwise, only increase the counter (value) for this key (num)
            counter.put(digit,counter.get(digit) + 1);
        }

        for (Map.Entry<Double, Integer> entry : counter.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
