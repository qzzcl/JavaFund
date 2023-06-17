package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String initialEntry = scanner.nextLine();
        List<String> shoppingList = Arrays
                .stream(initialEntry.split("\\!"))
                .collect(Collectors.toList());
        String command = "";

        while (true){
            command = scanner.nextLine();
            String[] commArr = command.split(" ");
            
            if (command.equals("Go Shopping!")){

                break;
            }else if (command.contains("Urgent")) {
                String item = commArr[1];
                if (!shoppingList.contains(item)){
                    shoppingList.add(0,item);
                }
            }else if (command.contains("Unnecessary")) {
                String item = commArr[1];
                shoppingList.remove(item);
            }else if (command.contains("Correct")) {
                String oldItem = commArr[1];
                String newItem = commArr[2];

                if (shoppingList.contains(oldItem)){
                    int indexOldItem = shoppingList.indexOf(oldItem);
                    shoppingList.set(indexOldItem,newItem);
                }
            }else if (command.contains("Rearrange")) {
                String item = commArr[1];
                if(shoppingList.contains(item)){
                    int indexItem = shoppingList.indexOf(item);
                    shoppingList.add(item);
                    shoppingList.remove(indexItem);
                }
            }
        }
        System.out.println(shoppingList.toString().replace("[","").replace("]",""));
    }
}
