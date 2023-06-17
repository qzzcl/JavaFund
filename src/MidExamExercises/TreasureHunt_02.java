package MidExamExercises;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<String> listLoot = Arrays
                .stream(inputS.split("\\|"))
                .collect(Collectors.toList());

        while(true){
            String command = scanner.nextLine();
            if (command.contains("Yoho")){
                break;
            }
            String[] commArr = command.split(" ");
            if (command.contains("Loot")) {
                for (int i = 1 ; i<commArr.length ;i++ ){
                    String currentItem = commArr[i];
                    if (!listLoot.contains(currentItem)){
                        listLoot.add(0,currentItem);
                    }
                }
            }else if (command.contains("Drop")) {
                int index = Integer.parseInt(commArr[1]);
                if (index >= 0 && index <= listLoot.size()-1){
                    listLoot.add(listLoot.get(index));
                    listLoot.remove(index);
                }
            }else if (command.contains("Steal")) {
                int numItemsStolen = Integer.parseInt(commArr[1]);
                List<String> stolenItemsL = new ArrayList<>();
                for (int i =listLoot.size()-1 ; i >= 0 ; i--){
                    stolenItemsL.add(listLoot.get(i));
                    listLoot.remove(i);
                    numItemsStolen--;
                    if(numItemsStolen == 0){
                        break;
                    }
                }
                Collections.reverse(stolenItemsL);
                System.out.println(stolenItemsL.toString()
                        .replace("[","")
                        .replace("]",""));
            }
        }
        if (listLoot.size() <= 0){
            System.out.println("Failed treasure hunt.");
        }else{
            int sum =0;
            for (int y = 0 ; y < listLoot.size() ; y++){
                String currentElement = listLoot.get(y);
                sum += currentElement.length();
            }
            double averageGain = (sum *1.0) / listLoot.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",averageGain);
        }
    }
}
