package FinalExamOldExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String,Integer> cityPopulation = new LinkedHashMap<>();
        Map<String,Integer> cityGold = new LinkedHashMap<>();

        while (true){
            String commandArr = scanner.nextLine();
            if (commandArr.contains("Sail")){
                break;
            }

            String city = commandArr.split("\\|\\|")[0];
            int population = Integer.parseInt(commandArr.split("\\|\\|")[1]);
            int gold = Integer.parseInt(commandArr.split("\\|\\|")[2]);

            if(!cityPopulation.containsKey(city)){
                cityPopulation.putIfAbsent(city,population);
                cityGold.putIfAbsent(city,gold);
            }else{
                //update
                cityPopulation.put(city,cityPopulation.get(city) + population);
                cityGold.put(city,cityGold.get(city) + gold);
            }

        }

        while(true){
            String commandArr = scanner.nextLine();
            if (commandArr.contains("End")){
                break;
            }

            String command = commandArr.split("=>")[0];

            switch (command){
                case "Plunder" :
                    String town = commandArr.split("=>")[1];
                    int people = Integer.parseInt(commandArr.split("=>")[2]);
                    int gold = Integer.parseInt(commandArr.split("=>")[3]);

                    //remove people killed and gold stolen
                    cityPopulation.put(town,cityPopulation.get(town) - people);
                    cityGold.put(town,cityGold.get(town) - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);

                    if (cityPopulation.get(town) <= 0 || cityGold.get(town) <= 0){
                        System.out.printf("%s has been wiped off the map!%n",town);
                        cityPopulation.remove(town);
                        cityGold.remove(town);
                    }
                    break;
                case "Prosper" :
                    String town2 = commandArr.split("=>")[1];
                    int gold2 = Integer.parseInt(commandArr.split("=>")[2]);

                    if (gold2 < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        cityGold.put(town2,cityGold.get(town2) + gold2);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold2,town2,cityGold.get(town2));
                    }
                    break;
            }
        }
        int size = cityPopulation.size();
        if(size > 0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",size);
            for (Map.Entry<String, Integer> populEnt : cityPopulation.entrySet()) {
                for (Map.Entry<String, Integer> goldEnt : cityGold.entrySet()) {
                    if(populEnt.getKey().equals(goldEnt.getKey())){
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",populEnt.getKey(),populEnt.getValue(),goldEnt.getValue());
                    }
                }
            }
        }else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
