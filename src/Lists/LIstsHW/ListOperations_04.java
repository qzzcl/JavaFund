package Lists.LIstsHW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        while(true){
            String command = scanner.nextLine();

            //strip down command and digits
            String[] commandArr = command.split(" ");
            String action = commandArr[0];
            int number;
            int index;

            switch (action){
                case "Add" :
                    number = Integer.parseInt(commandArr[1]);
                    listInts.add(number);
                    break;
                case "Insert" :
                    number = Integer.parseInt(commandArr[1]);
                    index = Integer.parseInt(commandArr[2]);
                    if(checkIndexBounds(listInts,index)){
                        listInts.add(index,number);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove" :
                    index = Integer.parseInt(commandArr[1]);
                    if(checkIndexBounds(listInts,index)){
                        listInts.remove(index);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift" :
                    int count = Integer.parseInt(commandArr[2]);
                    String direction = commandArr[1];

                    if (direction.equals("left")){
                        for (int i = 0 ; i < count; i++){
                            int firstVal = listInts.get(0);             // save the value of index 0 into a temp var
                            listInts.remove(0);                   // remove index 0 from the list
                            listInts.add(firstVal);             //set value of index 0 to last position in the list
                        }
                    }else if (direction.equals("right")){
                        for (int i = 0 ; i < count; i++){
                            int lastVal = listInts.get(listInts.size()-1);        //store val last
                            listInts.remove(listInts.size()-1);             //remove last
                            listInts.add(0,lastVal);                       //set value of index 0 to last position in the list
                        }
                    }
                    break;
                default:
                    break;
            }

            if (command.equals("End")){
                System.out.println(listInts.toString().replace("[","").replace("]","").replace(",",""));
                break;
            }
        }
    }

    private static boolean checkIndexBounds (List<Integer> list,int indexToCheck){
        if (indexToCheck > list.size()-1 || indexToCheck < 0){
            return false;
        }
        return true;
    }
}
