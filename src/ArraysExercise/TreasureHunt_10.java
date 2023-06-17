package ArraysExercise;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] treasureChest = scanner.nextLine().split("\\|");

        //String command = scanner.nextLine();
        String command ="";
        double sum = 0.0;
        double averageGain = 0.0;

        while(!command.equals("Yohoho!")){
            command = scanner.nextLine();
            //split the command into an array
            String[] commandArray = command.split(" ");
            if (command.contains("Loot")){

                //now add/skip. Start at 1 cuz 1st item is the command Loot
                for (int i = 1 ; i < commandArray.length; i++){
                    boolean addToChest = true;
                    for (int z = 0 ; z < treasureChest.length ; z++){
                        if (commandArray[i].equals(treasureChest[z])){                //make sure the item is not in the chest already
                            addToChest = false;
                            break;
                        }
                    }
                    if(addToChest){
                        String temp = commandArray[i];                     //hold temporarily 1st item

                        //insert the loot at position 0, then shift the rest of the elements to the right
                        String[] newLargerChest = new String[treasureChest.length+1];
                        newLargerChest[0] = temp;
                        for (int z = 1 ; z < newLargerChest.length ; z++){
                            newLargerChest[z] = treasureChest[z-1];
                        }
                        //resize
                        treasureChest = newLargerChest;
                    }
                }
            }else if (command.contains("Drop")){
                int index = Integer.parseInt(commandArray[1]);         //parse the index to int
                if (index > treasureChest.length-1 || index < 0){            //check and skip if the index is not existent
                    continue;
                }
                String temp = treasureChest[index];             //save the dropped item temporarily

                //push all elements to the left (starting at the indexToDrop element, not from index 0) BUT without the last one
                for (int i = index ; i < treasureChest.length-1; i++){
                    treasureChest[i] = treasureChest[i+1];
                }
                treasureChest[treasureChest.length-1] = temp;
            } else if (command.contains("Steal")) {
                int count = Integer.parseInt(commandArray[1]);
                if (count < 1 || count > 100){
                    continue;
                }
                //if the stolen items are more than what's in the chest, empty the chest
                if (count > treasureChest.length-1){
                    for (int i = 0 ; i < treasureChest.length; i++){
                        if(i < treasureChest.length-1){
                            System.out.print(treasureChest[i] + ", ");
                        }else {
                            System.out.println(treasureChest[i]);
                        }
                        treasureChest[i]="";
                    }
                    //resize
                    String[] newEmtyChest = new String[0];
                    treasureChest = newEmtyChest;
                }else{
                    for (int i = treasureChest.length-count ; i <= treasureChest.length-1; i++){
                            if(i < treasureChest.length-1){
                                System.out.print(treasureChest[i] + ", ");
                            }else {
                                System.out.println(treasureChest[i]);
                            }
                            treasureChest[i]="";
                    }

                    //resize
                    //get real count of items in the chest (without empty slots)
                    int numElements = 0;
                    for (int i = 0 ; i < treasureChest.length ; i++){
                        if(treasureChest[i].length() > 0){
                            numElements++;
                        }
                    }
                    //new array with actual siz
                    String[] newSmallerChest = new String[numElements];
                    //fill new array with items
                    for (int i = 0 ; i < treasureChest.length ; i++){
                        if(treasureChest[i].length() > 0){
                            newSmallerChest[i] = treasureChest[i];
                        }
                    }
                    treasureChest = newSmallerChest;
                }
            }
        }

        double realSize = 0.0;
        //calc the average points
       for (int i = 0 ; i < treasureChest.length ; i++){
            if (treasureChest[i].length() >0){
                sum += treasureChest[i].length();
                realSize++;
            }
        }
        averageGain = sum <= 0 ? 0 : sum / realSize;
        if (averageGain <= 0){
            System.out.println("Failed treasure hunt.");
        }else{
            System.out.printf("Average treasure gain: %.2f pirate credits.",averageGain);
        }
    }
}
