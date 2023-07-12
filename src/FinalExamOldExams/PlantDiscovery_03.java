package FinalExamOldExams;

import java.util.*;
//
public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String entry = scanner.nextLine();
            String plant = entry.split("<->")[0];
            int rarity = Integer.parseInt(entry.split("<->")[1]);

            //add if non existent
            plantRarity.putIfAbsent(plant,rarity);
            plantRating.putIfAbsent(plant,new ArrayList<>());
            //update if already existent
            plantRarity.put(plant,rarity);
        }

        while(true){
            String command = scanner.nextLine();
            if(command.equals("Exhibition")){
                break;
            }

            String plant = command.split("\\s+")[1];
            if(!plantRarity.containsKey(plant)){
                System.out.println("error");                continue;
            }

            if (command.contains("Rate")){
                double rating = Double.parseDouble(command.split("- ")[1]);
                if(plantRating.containsKey(plant)){
                    plantRating.get(plant).add(rating);
                }
            }
            else if(command.contains("Update")){
                int newRarity = Integer.parseInt(command.split("- ")[1]);
                plantRarity.put(plant,newRarity);
            }
            else if (command.contains("Reset")) {
                if(plantRating.containsKey(plant)){
                    plantRating.get(plant).clear();
                }
            }
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> plant : plantRarity.entrySet()) {
            for (Map.Entry<String, Integer> rarityObj : plantRarity.entrySet()) {
                if(rarityObj.getKey().equals(plant.getKey())){
                    double average = averageRating(plantRating.get(rarityObj.getKey()));
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",plant.getKey(),plant.getValue(),average);
                }
            }
        }
    }
    public static double averageRating(List<Double> ratingsList){
        double average = 0;
        if(ratingsList.isEmpty()){
            return 0.00;
        }
        for (Double rating : ratingsList) {
            average += rating;
        }
        if(average <= 0){
            return 0.00;
        }else{
            return average/ratingsList.size();
        }
    }
}
