package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String items = scanner.nextLine();
        List<String> itemsList = Arrays
                .stream(items.split(", "))
                .collect(Collectors.toList());


        while (true){
            String command = scanner.nextLine();
            if (command.contains("Craft")){
                System.out.println(itemsList.toString()
                        .replace("[","")
                        .replace("]",""));
                break;
            }

            String[] commArr = command.split(" - ");
            String item = commArr[1];

            if (command.contains("Collect")){
                if(!itemsList.contains(item)){
                    itemsList.add(item);
                }
            }else if (command.contains("Drop")){
                itemsList.remove(item);
            }else if (command.contains("Combine")){
                System.out.println();
                String[] commArr2 = item.split(":");
                item = commArr2[0];
                String newItem = commArr2[1];
                if (itemsList.contains(item)){
                    int indexOldItem = itemsList.indexOf(item);
                    itemsList.add(indexOldItem+1,newItem);
                }
            }else if (command.contains("Renew")){
                if (itemsList.contains(item)){
                    itemsList.add(item);
                    itemsList.remove(item);
                }
            }
        }
    }
}
