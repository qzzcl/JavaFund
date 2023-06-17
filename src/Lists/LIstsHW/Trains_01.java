package Lists.LIstsHW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Trains_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> train = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCap = Integer.parseInt(scanner.nextLine());
        String command = "";

        while(true){
            command = scanner.nextLine();

            if(command.equals("end")){
                System.out.println(train.toString().replace("[","").replace("]","").replace(",",""));
                break;
            }

            String[] commandArr = command.split(" ");
            int passengers = 0;
            if (command.contains("Add")){
                passengers = Integer.parseInt(commandArr[1]);
            }else {
                passengers = Integer.parseInt(commandArr[0]);
            }

            if (command.contains("Add")) {
                train.add(passengers);
            } else {
                for (int i = 0 ; i <train.size() ; i++){
                    //get free seats in wagon[i]
                    int  freeSeats = maxCap - train.get(i);
                    if (freeSeats >= passengers){
                        train.set(i,train.get(i) + passengers);
                        break;
                    }
                }
            }
        }
    }
}
