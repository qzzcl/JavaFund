package Lists.LIstsExtraExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputString = scanner.nextLine();

        String message ="";
        for (int i = 0 ; i < listInts.size(); i++){
            int sumDigitsElement=0;
            int element = listInts.get(i);
            //loop thru the element to get the sum
            while(element > 0){
                int lastDigit = element % 10;
                sumDigitsElement += lastDigit;
                element /= 10;
            }

            int counterSum = 0;
            int symbolIdx=0;
            char symbol = 0;
            int stringListSize = inputString.length();

            while (counterSum <= sumDigitsElement){

                if (counterSum == sumDigitsElement){
                    symbol = inputString.charAt(symbolIdx);

                    //now remove the char from the list
                    StringBuilder sb = new StringBuilder(inputString);
                    sb.deleteCharAt(symbolIdx);
                    inputString = sb.toString();
                }

                counterSum++;
                symbolIdx++;
                //if it reaches the end of the list, reset
                if (symbolIdx > stringListSize-1){
                    symbolIdx = 0;
                }
            }
            message += symbol;
        }
        System.out.println(message);
    }
}
