package AssociativeArrays.HW;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, Integer> namePoints = new LinkedHashMap<>();
        Map<String, Integer> langSubmiss = new LinkedHashMap<>();


        while (true){
            String commandInput = scanner.nextLine();
            if (commandInput.equals("exam finished")){
                break;
            }

            String name = commandInput.split("-")[0];
            String secondComm = commandInput.split("-")[1];

            if(!secondComm.equals("banned")){
                //submission entry
                String lang = secondComm;
                int points = Integer.parseInt(commandInput.split("-")[2]);

                //generate key/name when 1st time
                namePoints.putIfAbsent(name,0);

                //add/replace if already existing

                int lastPoints = namePoints.get(name);
                if(lastPoints < points){
                    namePoints.put(name,points);
                }

                //generate new lang Key if missing
                langSubmiss.putIfAbsent(lang,0);

                //increase lang submissions count
                int oldCount = langSubmiss.get(lang);
                langSubmiss.put(lang,oldCount + 1);
            }else{
                //banned user
                namePoints.remove(name);
            }
        }

        System.out.println("Results:");
        //sort and print - valid submissions
        // - sort in Descending Order by Value
        // - then sort by key (name) to handle equal values(points)
        //then print each key + value using for each
        namePoints.entrySet().stream()
                //.sorted(Map.Entry.<String,Integer> comparingByKey()
                //.thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        //sort languages by key and print each
        langSubmiss.entrySet()
                //.sorted(Map.Entry.<String,Integer> comparingByValue().reversed()
                //.thenComparing(Map.Entry.comparingByValue()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

            }
}
