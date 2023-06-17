package Lists.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> intList = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        gaussTrick(intList);
        for (Integer e : intList) {
            System.out.print(e + " ");
        }
    }
    private static void gaussTrick(List<Integer> listInt){
        if (listInt.size() % 2 != 0){
            for (int i = 0 ; i < listInt.size()/2 ; i++){
                int firstVal = listInt.get(i);
                int lastVal = (listInt.get(listInt.size() - 1));
                int firstIdx = i;
                int lastIdx = (listInt.size()-1);

                //add first and last
                listInt.set(i, firstVal + lastVal);
                System.out.println();

                //remove last
                listInt.remove(lastIdx);
            }
        }else{
            for (int i = 0 ; i < listInt.size() ; i++){
                int firstVal = listInt.get(i);
                int lastVal = (listInt.get(listInt.size() - 1));
                int firstIdx = i;
                int lastIdx = (listInt.size()-1);

                //add first and last
                listInt.set(i, firstVal + lastVal);
                //remove last

                listInt.remove(lastIdx);
            }
        }

    }
}