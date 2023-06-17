package Lists.LIstsHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int inputInt = Integer.parseInt(scanner.nextLine());
        List<String> guestsL = new ArrayList<>();

        for (int i = 0 ; i < inputInt ; i++){
            String command = scanner.nextLine();
            while(command.equals("") || command.equals(" ")){
                command = scanner.nextLine();
            }
            //strip down name from command
            String[] commandArr = command.split(" ");
            String name = commandArr[0];

            //check if name is on the list
            boolean isNameOnList = guestsL.stream()
                    .anyMatch(e -> e.contains(name));

            if (command.contains("not")){
                //remove from the list if present
                if(isNameOnList){
                    for (int z = 0 ; z <guestsL.size() ; z++){
                        if(guestsL.get(z).contains(name)){
                            guestsL.remove(z);
                            z--;
                        }
                    }
                }else{                  //name not on the list
                    System.out.println(name + " is not in the list!");
                }
            }else{
                //add to the list if NOT already present
                if(!isNameOnList){
                    guestsL.add(name);
                }else{
                    System.out.println(name + " is already in the list!");
                }
            }
        }
        for (String e : guestsL){
            System.out.println(e);
        }
    }
}
