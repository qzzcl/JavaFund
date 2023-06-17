package Lists.LIstsHW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();

        List<Integer> distancesList = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumOfRemoved =0 ;

        while(distancesList.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0){
                //If the given index is LESS than 0, remove the first element of the sequence, and COPY the last element to its place.
                int lastE = distancesList.get(distancesList.size()-1);
                int firstE = distancesList.get(0);
                distancesList.remove(0);
                distancesList.add(0,lastE);
                editListElements(distancesList,firstE);
            }else if(index > distancesList.size()-1){
                //If the given index is GREATER than the last index of the sequence, remove the last element from the sequence, and COPY the first element to its place.
                int firstE = distancesList.get(0);
                int lastE = distancesList.get(distancesList.size()-1);
                distancesList.remove(distancesList.size()-1);
                distancesList.add(firstE);
                editListElements(distancesList,lastE);
            }else{
                int selectedElement = distancesList.get(index);
                sumOfRemoved += selectedElement;

                //remove the element from that index
                distancesList.remove(index);

                editListElements(distancesList,selectedElement);
//                //modify values for the rest of the list
//                for (int i = 0 ; i <distancesList.size() ; i++){
//                    int currentE = distancesList.get(i);
//
//                    if (currentE <= selectedElement){
//                        distancesList.set(i,currentE+selectedElement);
//                    }else if (currentE > selectedElement){
//                        distancesList.set(i, currentE-selectedElement);
//                    }
//                }
            }
        }
        System.out.println(sumOfRemoved);
    }
    private static void editListElements(List<Integer> list, int removedElVal){

        for (int i = 0 ; i <list.size() ; i++){
            int currentE = list.get(i);
            int selectedElVal = list.get(removedElVal);

            if (currentE <= selectedElVal){
                list.set(i,currentE+selectedElVal);
            }else {
                list.set(i, currentE-selectedElVal);
            }
        }
    }
}

/*
    You must INCREASE the value of all elements in the sequence which are LESS or EQUAL to the removed
    element with the value of the removed element.

    You must DECREASE the value of all elements in the sequence which are GREATER than the removed
    element with the value of the removed element.
 */