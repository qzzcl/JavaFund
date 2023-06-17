package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listNeigh = Arrays
                .stream(inputS.split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int currentPosIdx = 0;

        while (true){
            String command = scanner.nextLine();

            if (command.equals("Love!")){
                System.out.printf("Cupid's last position was %d.%n",currentPosIdx);
                int countFailedHouses = 0;
                for (int e : listNeigh){
                    if(e != 0){
                        countFailedHouses++;
                    }
                }
                if(countFailedHouses == 0){
                    System.out.println("Mission was successful.");
                }else{
                    System.out.printf("Cupid has failed %d places.%n",countFailedHouses);
                }
                break;
            }else{
                String[] commArr = command.split(" ");
                int jump = Integer.parseInt(commArr[1]);

                currentPosIdx = currentPosIdx+jump <= listNeigh.size()-1 ? currentPosIdx+jump : 0;
                int currentElementVal = listNeigh.get(currentPosIdx);

                if(currentElementVal >0){
                    listNeigh.set(currentPosIdx,currentElementVal-2);
                    currentElementVal = listNeigh.get(currentPosIdx);
                    if(currentElementVal <= 0){
                        System.out.printf("Place %d has Valentine's day.%n",currentPosIdx);
                    }
                }else{
                    System.out.printf("Place %d already had Valentine's day.%n",currentPosIdx);
                }
            }
        }
    }
}
