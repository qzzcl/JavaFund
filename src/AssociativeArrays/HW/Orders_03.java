package AssociativeArrays.HW;

import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Double> mapPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> mapQuant = new LinkedHashMap<>();

        while(true){
            String inputS = scanner.nextLine();
            String product = inputS.split(" ")[0];
            if(product.contains("buy")){
                break;
            }
            double cost = Double.parseDouble(inputS.split(" ")[1]);
            int quantity = Integer.parseInt(inputS.split(" ")[2]);

            //if the product doesn't exist - add it
            if(!mapQuant.containsKey(product)){
                mapQuant.put(product,quantity);
                mapPrice.put(product,cost);
            }
            //otherwise - update values
            else{
                int oldQuant = mapQuant.get(product);
                mapQuant.put(product,oldQuant+quantity);
                mapPrice.put(product,cost);
            }
        }

        LinkedHashMap<String,Double> finalInvetoryM = new LinkedHashMap<>();

        for (Map.Entry<String, Double> entry : mapPrice.entrySet()) {
            String productKey = entry.getKey();

            double price = entry.getValue();
            int quantity = 0;

            if(mapQuant.containsKey(productKey)){
                quantity = mapQuant.get(productKey);
            }

            finalInvetoryM.put(productKey,price * quantity);
        }

        for (Map.Entry<String, Double> entry : finalInvetoryM.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue());
        }

    }
}
