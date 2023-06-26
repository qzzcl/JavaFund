package Lists.LIstsExtraExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<String> listWholeStr = new ArrayList<>();

        //string to list, no delimiter, adding all chars
        for (int i = 0 ; i < inputS.length() ; i++){
            char currentChar = inputS.charAt(i);
            listWholeStr.add(String.valueOf(currentChar));
        }

        List<Integer> listIntsAll = new ArrayList<>();
        List<String> listNonDigits = new ArrayList<>();

        //extract all digits and other characters from the string list
        for (int i = 0 ; i < listWholeStr.size(); i++){
            String currentElement = listWholeStr.get(i);
            char currentChar = currentElement.charAt(0);
            if (Character.isDigit(currentChar)){
                listIntsAll.add(Integer.parseInt(currentElement));
            }else{
                listNonDigits.add(currentElement);
            }
       }

        //split further the digits list into odd/even lists
        List<Integer> listTake = new ArrayList<>();
        List<Integer> listSkip = new ArrayList<>();

        for (int i = 0 ; i < listIntsAll.size(); i++){
           //place even index digits to take list
            if (i % 2 == 0){
               listTake.add(listIntsAll.get(i));
           }else{
                listSkip.add(listIntsAll.get(i));
           }
        }

        List<String> listResult = new ArrayList<>();

        int largerListSize = Math.max(listTake.size(), listSkip.size());

        int startingIdx = 0;
        for (int i = 0 ; i<largerListSize ; i++){
            //first take then skip
            int charsToTake = listTake.get(i);

            int endingIdx = Math.min((startingIdx + charsToTake), listNonDigits.size());
            List<String> sublistToAdd = listNonDigits.subList(startingIdx,endingIdx);

            if(!sublistToAdd.isEmpty() && charsToTake != 0){
                //listResult.add(sublistToAdd.toString());
                listResult.addAll(sublistToAdd);
            }

            //skip
            int charsToSkip = listSkip.get(i) ;
            startingIdx += charsToSkip + charsToTake;
        }

//        System.out.println(listResult.toString()
//                .replace("[","")
//                .replace("]","")
//                .replace(",",""));

        for (String e : listResult ){
            System.out.print(e);
        }
    }
}
