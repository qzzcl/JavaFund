package AssociativeArrays.HW;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Integer> mapResources = new LinkedHashMap<>();

        while(true){
            String resource = scanner.nextLine();
            if(resource.contains("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!mapResources.containsKey(resource)){
                mapResources.put(resource,quantity);
            }else{
                int currentQuantity = mapResources.get(resource);
                mapResources.put(resource,currentQuantity + quantity);
            }
        }

        for (Map.Entry<String, Integer> entry : mapResources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
