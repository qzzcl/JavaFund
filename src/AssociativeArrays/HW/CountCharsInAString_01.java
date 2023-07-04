package AssociativeArrays.HW;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();

        LinkedHashMap<String, Integer> mapCounter = new LinkedHashMap<>();

        for (int i = 0 ; i < inputS.length(); i++){
            char currentChar = inputS.charAt(i);
            String charAsString = String.valueOf(currentChar);

            if(currentChar == ' '){
                continue;
            }
            if (!mapCounter.containsKey(charAsString)){
                mapCounter.put(charAsString,1);
            }else{
                mapCounter.put(charAsString,mapCounter.get(charAsString)+1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapCounter.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
