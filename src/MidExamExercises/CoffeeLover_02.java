package MidExamExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<String> coffeeList = Arrays
                .stream(inputS.split(" "))
                .collect(Collectors.toList());
        int numComm = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i < numComm ; i++){
            String command = scanner.nextLine();

            if (command.contains("Reverse")){
                Collections.reverse(coffeeList);
            }else{
                String[] commArr = command.split(" ");

                if (command.contains("Include")){
                    String coffeeType = commArr[1];
                    coffeeList.add(coffeeType);
                }else if (command.contains("Remove")){
                    int listSize = coffeeList.size();

                    String subComm = commArr[1];
                    int numCoffToRem = Integer.parseInt(commArr[2]);

                    if (numCoffToRem <= listSize){
                        if (subComm.contains("first")){
                            for (int z = 0 ; z < numCoffToRem ; z++){
                                coffeeList.remove(z);
                                z--;
                                numCoffToRem--;
                            }
                        }else if(subComm.contains("last")){
                            for (int z = coffeeList.size()-1 ; z >= 0  ; z--){
                                coffeeList.remove(z);
                                numCoffToRem--;
                                if (numCoffToRem == 0){
                                    break;
                                }
                            }
                        }
                    }
                }else if (command.contains("Prefer")){
                    int index1 = Integer.parseInt(commArr[1]);
                    int index2 = Integer.parseInt(commArr[2]);

                    if (index1 >= 0 && index1 <= coffeeList.size()-1){
                        if (index2 >= 0 && index2 <= coffeeList.size()-1){
                            String coffIndex1 = coffeeList.get(index1);

                            coffeeList.set(index1, coffeeList.get(index2));
                            coffeeList.set(index2, coffIndex1);
                        }
                    }
                }

            }
        }
        System.out.println("Coffees:");
        System.out.println(coffeeList.toString()
                .replace("[","")
                .replace("]","")
                .replace(",",""));
    }
}
