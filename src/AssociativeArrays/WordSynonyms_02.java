package AssociativeArrays;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> mapWords = new LinkedHashMap<>();

        for (int i = 0 ; i < numEntries ; i++){
            String keyWord = scanner.nextLine();
            String valSyn = scanner.nextLine();

            //if its a new word - create key and value
            if(!mapWords.containsKey(keyWord)){
                //initiate a new list that holds the synonym
                List<String> listSyn = new ArrayList<>(Arrays.asList(valSyn));
                mapWords.put(keyWord,listSyn);
            }
            //if the word already exists - we add a new synonym to the values
            else{
                List<String> tempList = mapWords.get(keyWord);
                tempList.add(valSyn);
                mapWords.put(keyWord,tempList);
            }
        }
        System.out.println();
        for (Map.Entry<String, List<String>> entry : mapWords.entrySet()) {
            String key = entry.getKey();
            List<String> tempList = entry.getValue();

            System.out.printf("%s - %s%n", entry.getKey(), tempList.toString() .replace("[","")
            .replace("]",""));

        }

    }
}
