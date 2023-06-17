package MidExamExercises;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //find average of the list
        double average=0.0;
        for (int i = 0 ; i < listInts.size() ; i++){
            average += listInts.get(i);
        }
        average /= listInts.size();

        List<Integer> listAboveAvrg = new ArrayList<>();
        //get top 5 numbers that are > average
        for (int i = 0 ; i <listInts.size() ; i++){
            if (listInts.get(i) > average){
                listAboveAvrg.add(listInts.get(i));
            }
        }
        //print the collection in descending order
        Collections.sort(listAboveAvrg);
        Collections.reverse(listAboveAvrg);

        if (listAboveAvrg.size() <= 0){
            System.out.println("No");
            return;
        }

        for (int i = 0 ; i < listAboveAvrg.size() ; i++){
            System.out.printf("%d ",listAboveAvrg.get(i));
            if (i == 4){
                break;
            }
        }
    }
}
