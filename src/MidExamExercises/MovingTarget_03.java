package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(true){
            String command = scanner.nextLine();
            if (command.equals("End")){
                break;
            }
            String[] commArr = command.split(" ");
            int index = Integer.parseInt(commArr[1]);
            int digit2 = Integer.parseInt(commArr[2]);

            if (command.contains("Shoot")){
                if (index >= 0 && index <= listInts.size()-1) {
                    int currentTargetVal = listInts.get(index);
                    int targetValAfterShot = currentTargetVal - digit2;

                    listInts.set(index,targetValAfterShot);

                    if(targetValAfterShot <=0){
                        listInts.remove(index);
                    }
                }
            }else if (command.contains("Add")){
                if (index >= 0 && index <= listInts.size()-1) {
                    listInts.add(index,digit2);
                }else{
                    System.out.println("Invalid placement!");
                }
            }
            if (command.contains("Strike")){
                int lowerBoundIdx = index-digit2;
                int upperBoundIdx = index+digit2;

                if(lowerBoundIdx >= 0 && upperBoundIdx <= listInts.size()-1){
                    for ( int i = lowerBoundIdx ; i <= upperBoundIdx ; i++){
                        listInts.remove(i);
                        i--;
                        upperBoundIdx--;
                    }
                }else{
                    System.out.println("Strike missed!");
                }
            }
        }
        for(int i = 0 ; i < listInts.size() ; i++){
            if(i != listInts.size()-1){
                System.out.print(listInts.get(i) + "|");
            }else{
                System.out.print(listInts.get(i));
            }
        }
    }
}
