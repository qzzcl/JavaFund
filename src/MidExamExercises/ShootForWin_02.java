package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int shotTargets=0;

        while(true){
            String command = scanner.nextLine();
            if (command.equals("End")){

                break;
            }
            int indexToShoot = Integer.parseInt(command);

            if(indexToShoot >= 0 && indexToShoot <= listInts.size()-1){
                //if this index is not shot
                if (listInts.get(indexToShoot) != -1){
                    int targetValue = listInts.get(indexToShoot);
                    listInts.set(indexToShoot,-1);
                    shotTargets++;
                    //reduce/increase other targets
                    for (int i = 0 ; i <listInts.size() ; i++){
                        int currentSelectionVal = listInts.get(i);

                        if (i != indexToShoot && currentSelectionVal != -1){
                            if (currentSelectionVal > targetValue){
                                listInts.set(i,listInts.get(i) - targetValue);
                            }else{
                                listInts.set(i,listInts.get(i) + targetValue);
                            }
                        }
                    }
                }
            }
        }

        System.out.printf("Shot targets: %d -> " + listInts.toString()
                .replace("[","")
                .replace("]","")
                        .replace(",","")
                ,shotTargets);
    }
}
