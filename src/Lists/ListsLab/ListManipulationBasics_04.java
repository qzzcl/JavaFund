package Lists.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> listInt = Arrays
                .stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = null;

        while (true){
            command = scanner.nextLine();

            if (command.equals("end")){
                for (int e : listInt ){
                    System.out.print(e + " ");
                }
                break;
            }
            //strip down index/number from command
            String[] commandArr = command.split(" ");
            int indexNumber = Integer.parseInt(commandArr[1]);
            int indexOnly = command.contains("Insert") ? Integer.parseInt(commandArr[2]) : -1;

            if(command.contains("Add")){
                listInt.add(indexNumber);
            }else if (command.contains("RemoveAt")){
                listInt.remove(indexNumber);
            }else if (command.contains("Remove")){
                listInt.remove(Integer.valueOf(indexNumber));
            }else if (command.contains("Insert")){
                listInt.add(indexOnly,indexNumber);
            }
        }
    }
}
