package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Extra_LadyBugs_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());

        //check if the size is within constraints
        while (fieldSize < 0 || fieldSize > 1000){
            fieldSize = Integer.parseInt(scanner.nextLine());
        }
        int[] field = new int[fieldSize];

        int[] locationIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //fill the field with the initial locations of the ladybugs -----DOESN'T WORK WHEN THE FIELD IS DIFF SIZE FROM THE INDEXES PROVIDED. (EX FIELD OF 5 AND ONLY 1 BUG AT INDEX 3)
        for (int i = 0 ; i <locationIndexes.length ; i++){
            for (int z = 0 ; z < field.length ; z++){
                if (locationIndexes[i] == z){
                    field[z] = 1;
                }
            }
        }

        String command ="";

        while (true){
            command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }else {
                //step 1 - split the command elements into diff vars
                String[] commandA = command.split(" ");

                int ladybugIndex = Integer.parseInt(commandA[0]);
                String direction = commandA[1];
                int flyLength = Integer.parseInt(commandA[2]);

                //move the ladybug
                if (ladybugIndex < 0 || ladybugIndex > field.length-1){
                    continue;
                }
                if (ladybugIndex + flyLength > field.length-1 || ladybugIndex - flyLength < 0){
                    continue;
                }
                moveLadybug(ladybugIndex,direction,flyLength,field);
            }
        }

        System.out.println(Arrays.toString(field).replace("[","").replace("]","").replace(",",""));
    }

    private static void moveLadybug(int ladybugToMoveIndex, String direction, int flyLength, int[] field ){
        //preliminary check 1 - check if there is a ladybug in the given index/location to be moved. If no ladybug, return
        if (field[ladybugToMoveIndex] != 1) return;

        //preliminary check 2 - check if the selected ladybug index is inside the fieldSize
        if (field[ladybugToMoveIndex] > field.length-1 || field[ladybugToMoveIndex] < 0) return;

        //check if the target location index is empty or occupied and move

        if (direction.equals("right")){
            int targetIdx = ladybugToMoveIndex + flyLength;

            //check if the ladybug flew away. If not move it right
            if (targetIdx > field.length-1){
                field[ladybugToMoveIndex] = 0;
            }else{
                // if occupied, move the ladybug to the right/left until it lands on empty spot
                while (field[targetIdx] == 1){
                    targetIdx++;
                    if (targetIdx > field.length-1){
                        field[ladybugToMoveIndex] = 0;
                        return;
                    }
                }
                //check again if the ladybug flew away. If not move it right
                if (targetIdx > field.length-1){
                    field[ladybugToMoveIndex] = 0;
                }
                field[targetIdx] = 1;                           //fill the target location
                field[ladybugToMoveIndex] = 0;                  //empty the current location
            }
        }else if (direction.equals("left")){
            int targetIdx = ladybugToMoveIndex - flyLength;

            //check if the ladybug flew away. If not move it left
            if (targetIdx < 0){
                field[ladybugToMoveIndex] = 0;
            }else{
                // if occupied, move the ladybug to the left until it lands on empty spot
                while (field[targetIdx] == 1){
                    targetIdx--;
                    if (targetIdx < 0){
                        field[ladybugToMoveIndex] = 0;
                        return;
                    }
                }
                //check again if it flew away
                if (targetIdx < 0){
                    field[ladybugToMoveIndex] = 0;
                }
                field[targetIdx] = 1;                           //fill the target location
                field[ladybugToMoveIndex] = 0;                  //empty the current location
            }
        }
    }
}
