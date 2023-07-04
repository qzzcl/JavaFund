package AssociativeArrays.HW;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map <String,Integer> shardsMap = new LinkedHashMap<>();
        Map <String,Integer> fragmentsMap = new LinkedHashMap<>();
        Map <String,Integer> motesMap = new LinkedHashMap<>();
        Map <String,Integer> junkMap = new LinkedHashMap<>();

        shardsMap.put("shards",0);
        fragmentsMap.put("fragments",0);
        motesMap.put("motes",0);

        while(true){
            String inputs = scanner.nextLine();
            String[] inputCommands = inputs.split(" ");

            //iterate over the whole list of commands. i = quantity / i+1 = material
            for (int i = 0; i < inputCommands.length ; i+=2) {
                int quantity = Integer.parseInt(inputCommands[i]);
                String material = inputCommands[i+1].toLowerCase();

                //"Shards", "Fragments", and "Motes" -- key materials
                if(material.contains("shards")){
                    int oldQuantity = shardsMap.get(material);
                    shardsMap.put(material,oldQuantity + quantity);

                    if(goalReached(shardsMap)){
                        System.out.println("Shadowmourne obtained!");
                        printAllMaps(shardsMap,motesMap,fragmentsMap,junkMap);
                        break;
                    }
                }else if (material.contains("fragments")){
                    fragmentsMap.put(material,fragmentsMap.get(material) + quantity);
                    if(goalReached(fragmentsMap)){
                        System.out.println("Valanyr obtained!");
                        printAllMaps(shardsMap,motesMap,fragmentsMap,junkMap);
                        break;
                    }
                }else if (material.contains("motes")){
                    int oldQuantity = motesMap.get(material);
                    motesMap.put(material,oldQuantity + quantity);
                    if(goalReached(motesMap)){
                        System.out.println("Dragonwrath obtained!");
                        printAllMaps(shardsMap,motesMap,fragmentsMap,junkMap);
                        break;
                    }
                }else{
                    if(junkMap.containsKey(material)){
                        junkMap.put(material,junkMap.get(material) + quantity);
                    }else{
                        junkMap.put(material,quantity);
                    }
                }
            }
        }

    }

    private static boolean goalReached(Map<String, Integer> map) {
        int sum =0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();

            if(sum >= 250){
                //decrease by 250 (spend)
                map.put(entry.getKey(), entry.getValue()-250);
                return true;
            }
        }
        return false;
    }

    public static void printAllMaps (Map<String,Integer> shards,Map<String,Integer> motes,Map<String,Integer> fragments, Map<String,Integer> junk ){
        for (Map.Entry<String, Integer> entry : shards.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : fragments.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : motes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
