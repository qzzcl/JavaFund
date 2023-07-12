package StringBuilder.ExerciseHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersChangeNums_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] entryS = scanner.nextLine().split("\\s+") ;
        List<Double> sumEachStringList = new ArrayList<>();

        for (int i = 0; i < entryS.length ; i++) {
            StringBuilder currentString = new StringBuilder(entryS[i]);
            double sumLetter1 = 0;
            double sumLetter2 = 0;

            //extract the digit
            double number = extractNum(currentString.toString());

            //now extract the 2nd letter from the string
            char letterOne = currentString.charAt(0);
            char letterTwo = ' ';

            for (int j = 1; j < currentString.length() ; j++) {
                char selectedChar = currentString.charAt(j);
                if(Character.isLetter(selectedChar)){
                    letterTwo = selectedChar;
                }
            }

            //first letter - divide uppercase, multiply lowercase
            int position1 = Character.toUpperCase(letterOne) - 65+1;
            if (Character.isUpperCase(letterOne)){
                sumLetter1 = number / position1;
            }else{
                sumLetter1 = number * position1;
            }

            //second letter - uppercase substract, lowercase add
            int position2 = Character.toUpperCase(letterTwo) - 65+1;
            if (Character.isUpperCase(letterTwo)){
                sumLetter2 = sumLetter1 - position2;
            }else{
                sumLetter2 = sumLetter1 + position2;
            }

            sumEachStringList.add(sumLetter2);
        }

        double finalSum = 0;
        for (Double elementSum : sumEachStringList) {
            finalSum += elementSum;
        }
        System.out.printf("%.2f",finalSum);

    }
    public static double extractNum (String string){
        StringBuilder digitAsString = new StringBuilder();
        double digit = 0;
        for (int j = 0; j < string.length(); j++) {
            char currentChar = string.charAt(j);

            if (Character.isDigit(currentChar)){
                digitAsString.append(currentChar);
            }
        }

        return digit = Double.parseDouble(digitAsString.toString());
    }
}
