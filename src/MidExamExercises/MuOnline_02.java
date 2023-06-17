package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int health = 100;
        int bitcoin = 0;
        String roomsInput = scanner.nextLine();
        List<String> roomsList = Arrays
                .stream(roomsInput.split("\\|"))
                .collect(Collectors.toList());

        for (int i = 0 ; i <roomsList.size() ; i++){
            String entry = roomsList.get(i);
            String[] commandArr = entry.split(" ");
            String command = commandArr[0];
            int amount = Integer.parseInt(commandArr[1]);

            switch (command){
                case "potion" :
                    if(health < 100){
                        int wound = 100-health;
                        if (wound > amount){
                            System.out.printf("You healed for %d hp.%n",amount);
                            health += amount;
                        }else{
                            System.out.printf("You healed for %d hp.%n",wound);
                            health = 100;
                        }
                    }

                    System.out.printf("Current health: %d hp.%n",health);
                    break;
                case "chest" :
                    bitcoin += amount;
                    System.out.printf("You found %d bitcoins.%n",amount);
                    break;
                default :
                    health -= amount;

                    if (health > 0){
                        System.out.printf("You slayed %s.%n",command);
                    }else{
                        System.out.printf("You died! Killed by %s.%n",command);
                        System.out.printf("Best room: %d%n",i+1);
                        return;
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n",bitcoin);
        System.out.printf("Health: %d%n",health);
    }
}
