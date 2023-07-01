package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CounterRealNums2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double[] inputArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        //now fill a treemap with the inputs - <DoubleEntry, CounterOccurences>
        TreeMap<Double,Integer> counter = new TreeMap<>();

        for (double inputEntry : inputArr ){
            //check if element is already in the treemap, if not,add it
            if(!counter.containsKey(inputEntry)){
                counter.put(inputEntry,0);
            }
            //if it is already present, increase the counter by 1
            //use put rather than edit/modify methods because it overrides
            counter.put(inputEntry,counter.get(inputEntry) + 1);
        }

        //now print -> 1. counter.entrySet() 2.Alt + Enter and go fo Iterate
        for (Map.Entry<Double, Integer> entry : counter.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(),entry.getValue());
        }

    }
}
