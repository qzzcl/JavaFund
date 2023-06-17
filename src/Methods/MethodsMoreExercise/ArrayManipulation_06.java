package Methods.MethodsMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] originalArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command;

        while(true){
            command = scanner.nextLine();
            String[] commandAsArr = command.split(" ");
            if (command.equals("end")){
                System.out.print(Arrays.toString(originalArray));
                break;
            } else if (command.contains("exchange")) {
                //extract index
                int splitIdx = Integer.parseInt(commandAsArr[1]);
                if(splitIdx > originalArray.length-1 || splitIdx < 0){
                    System.out.println("Invalid index");
                    continue;
                }
                exchangeArray(originalArray,splitIdx);
            }
            else if (command.equals("max even")) {
                maxEvenOdd(command,originalArray);
            }else if (command.equals("max odd")) {
                maxEvenOdd(command,originalArray);
            }

            else if (command.equals("min even")) {
                minEvenOdd(command,originalArray);
            }else if (command.equals("min odd")) {
                minEvenOdd(command,originalArray);
            }

            else if (command.contains("first")) {
                //System.out.println(Arrays.toString(firstXOddEven(command,finalArray)));
                firstXOddEven(command,originalArray);
            }else if (command.contains("last")) {
                lastXOddEven(command,originalArray);
            }
        }
    }


    private static int[] exchangeArray (int[] originalArray, int splitIndex){
        int originalArrLen = originalArray.length;
        int[] subArrayOne;
        int[] subArrayTwo;

        //copy the 2 parts of the split array into temp arrays, and then switch places
        subArrayOne = Arrays.copyOfRange(originalArray,0,splitIndex+1);
        subArrayTwo = Arrays.copyOfRange(originalArray,splitIndex+1,originalArrLen);
        System.arraycopy(subArrayTwo,0,originalArray,0,subArrayTwo.length);
        System.arraycopy(subArrayOne,0,originalArray,(originalArrLen-1)-splitIndex,subArrayOne.length);

        return originalArray;
    }

    private static void maxEvenOdd (String command, int[] intArray){
        int maxEvenIdx = -1;
        int maxOddIdx = -1;
        int lastElement=-1;
        if (command.equals("max even")){
            //get max even idx
            for (int i = 0 ; i < intArray.length ; i++){
                if (intArray[i] % 2 == 0){
                    if (intArray[i] >= lastElement){
                        lastElement = intArray[i];
                        maxEvenIdx = i;
                    }
                }
            }
        }else if (command.equals("max odd")){
            lastElement = -1;   //reset
            for (int i = 0 ; i < intArray.length ; i++){
                if (intArray[i] % 2 != 0){
                    if (intArray[i] >= lastElement){
                        lastElement = intArray[i];
                        maxOddIdx = i;
                    }
                }
            }
        }
        if (command.equals("max even")){
            if (maxEvenIdx > 0){
                System.out.println(maxEvenIdx);
            }else{
                System.out.println("No matches");
            }
        }else if (command.equals("max odd")){
            if(maxOddIdx > 0){
                System.out.println(maxOddIdx);
            }else{
                System.out.println("No matches");
            }
        }
    }

    private static void minEvenOdd (String command, int[] intArray){
        int minEvenIdx = -1;
        int minOddIdx = -1;
        int lastElement=Integer.MAX_VALUE;
        if (command.equals("min even")){
            //get max even idx
            for (int i = 0 ; i < intArray.length ; i++){
                if (intArray[i] % 2 == 0){
                    if (intArray[i] <= lastElement){
                        lastElement = intArray[i];
                        minEvenIdx = i;
                    }
                }
            }
        }else if (command.equals("min odd")){
            lastElement = Integer.MAX_VALUE;
            for (int i = 0 ; i < intArray.length ; i++){
                if (intArray[i] % 2 != 0){
                    if (intArray[i] <= lastElement){
                        lastElement = intArray[i];
                        minOddIdx = i;
                    }
                }
            }
        }

        if (command.equals("min even")){
            if (minEvenIdx <0){
                System.out.println("No matches");
            }else{
                System.out.println(minEvenIdx);
            }

        }else if (command.equals("min odd")){
            if (minOddIdx < 0){
                System.out.println("No matches");
            }else {
                System.out.println(minOddIdx); ;
            }
        }
    }

    private static void firstXOddEven (String command, int[] intArray){
        //extract the size of X from command and whether it is Odd/Even that we search for
        String[] commandArr = command.split(" ");
        int sizeX = Integer.parseInt(commandArr[1]);
        String commandOddOrEven = commandArr[2];

        if (sizeX > intArray.length || sizeX < 0){
            System.out.println("Invalid count");
            return ;
        }

        if(commandOddOrEven.equals("even")){
            int[] firstXEven = new int[sizeX];
            int counter = 0;

            for (int i = 0 ; i < intArray.length ; i++){
                if (intArray[i] % 2 == 0){
                    firstXEven[counter] = intArray[i];
                    counter++;
                }
                if (counter == sizeX || i == intArray.length -1){
                    if(counter >0){
                        int[] finalArray;
                        finalArray= Arrays.copyOfRange(firstXEven,0,counter);
                        System.out.println(Arrays.toString(finalArray));
                        return;
                    }else{
                        int[] emptyArray = new int[0];
                        System.out.println(Arrays.toString(emptyArray));
                        return;
                    }
                }
            }
        }else if (commandOddOrEven.equals("odd")){
            int[] firstXOdd = new int[sizeX];
            int counter = 0;

            for (int i = 0 ; i < intArray.length ; i++){
                if (intArray[i] % 2 != 0){
                    firstXOdd[counter] = intArray[i];
                    counter++;
                }
                if (counter == sizeX | i == intArray.length -1){
                    if (counter > 0){
                        int[] finalArray;
                        finalArray = Arrays.copyOfRange(firstXOdd,0,counter);
                        System.out.println(Arrays.toString(finalArray));
                        return;
                    }else{
                        int[] emptyArray = new int[0];
                        System.out.println(Arrays.toString(emptyArray));
                        return;
                    }
                }
            }
        }
    }
    private static void lastXOddEven (String command, int[] intArray){
        //extract the size of X from command and whether it is Odd/Even that we search for
        String[] commandArr = command.split(" ");
        int sizeX = Integer.parseInt(commandArr[1]);
        String commandOddOrEven = commandArr[2];

        if (sizeX > intArray.length || sizeX < 0){
            System.out.println("Invalid count");
            return;
        }

        //Print last but in ascending order
        if(commandOddOrEven.equals("even")){
            int[] lastXEven = new int[sizeX];
            int counter = 0;

            for (int i = intArray.length-1 ; i >=0  ; i--){
                if (intArray[i] % 2 == 0){
                    lastXEven[counter] = intArray[i];
                    counter++;
                }
                if (counter == sizeX || i == 0){
                    if(counter >0){
                        int[] finalArray;
                        finalArray= Arrays.copyOfRange(lastXEven,0,counter);

                        //reverse the order of elements
                        int[] tempArr = new int[finalArray.length];
                        int y = 0;
                        for (int z = finalArray.length-1 ; z >= 0 ; z--){
                            tempArr[y] = finalArray[z];
                            y++;
                        }
                        //return temp array which has the correct order
                        System.out.println(Arrays.toString(tempArr));
                        return;
                    }else{
                        int[] emptyArray = new int[0];
                        System.out.println(Arrays.toString(emptyArray));
                        return;
                    }
                }
            }
        }else if (commandOddOrEven.equals("odd")){
            int[] lastXOdd = new int[sizeX];
            int counter = 0;

            for (int i = intArray.length-1 ; i >=0  ; i--){
                if (intArray[i] % 2 != 0){
                    lastXOdd[counter] = intArray[i];
                    counter++;
                }
                if (counter == sizeX | i == 0){
                    if (counter > 0){
                        int[] finalArray;
                        finalArray = Arrays.copyOfRange(lastXOdd,0,counter);
                        //reverse the order of elements
                        int[] tempArr = new int[finalArray.length];
                        int y = 0;
                        for (int z = finalArray.length-1 ; z >= 0 ; z--){
                            tempArr[y] = finalArray[z];
                            y++;
                        }
                        System.out.println(Arrays.toString(tempArr));
                        return;
                    }else{
                        int[] emptyArray = new int[0];
                        System.out.println(Arrays.toString(emptyArray));
                        return;
                    }
                }
            }
        }
    }
}


/*

• exchange {index} – splits the array AFTER the given index and exchanges the places of the two resulting
subarrays. E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
    o If the index is outside the boundaries of the array, print "Invalid index".
• max even/odd – returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
• min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
    o If there are two or more equal min/max elements, return the index of the rightmost one.
    o If a min/max even/odd element cannot be found, print "No matches".
• first {count} even/odd – returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
• last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
    o If the count is greater than the array length, print "Invalid count".
    o If there are not enough elements to satisfy the count, print as many as you can. If there are zero
even/odd elements, print an empty array "[]".
• end – stop taking input and print the final state of the array.

 */
