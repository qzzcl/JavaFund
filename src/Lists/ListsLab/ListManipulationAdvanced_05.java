package Lists.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> listInt = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = null;

        while (true) {
            command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }
            //strip down index/number from command. Printin odd/even not extracted as it is not needed
            String[] commandArr = command.split(" ");

            int number = command.contains("Contains") ? Integer.parseInt(commandArr[1]) : -1;

            //case filter - 3 elements
            String operator = command.contains("Filter") ? commandArr[1] : "";
            int numberFilter = command.contains("Filter") ? Integer.parseInt(commandArr[2]) : -1;

            if(command.contains("Contains")){
                System.out.println(listInt.contains(number) ? "Yes" : "No such number");
            }else if (command.contains("even")){
                printEvenNumsList(listInt);
            }else if (command.contains("odd")){
                printOddNumsList(listInt);
            }else if (command.contains("sum")){
                printSumList(listInt);
            }else if (command.contains("Filter")){
                printConditionalList(listInt,operator,numberFilter);
            }
        }
    }

    private static void printEvenNumsList (List<Integer> listInt){
        List<Integer> evenNums = new ArrayList<>();
        for (int i = 0 ; i <listInt.size() ; i++){
            if (listInt.get(i) % 2 == 0 ){
                evenNums.add(listInt.get(i));
            }
        }
        System.out.println(evenNums.toString().replace("[","").replace("]","").replace(",",""));
    }
    private static void printOddNumsList (List<Integer> listInt){
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0 ; i <listInt.size() ; i++){
            if (listInt.get(i) % 2 != 0){
                oddNums.add(listInt.get(i));
            }
        }
        System.out.println(oddNums.toString().replace("[","").replace("]","").replace(",",""));
    }
    private static void printSumList (List<Integer> listInt){
        int sum = 0;
        for (int i = 0 ; i <listInt.size() ; i++){
            sum += listInt.get(i);
        }
        System.out.println(sum);
    }
    private static void printConditionalList (List<Integer> listInt, String operator, int number){
        List<Integer> filteredList = new ArrayList<>();
        if (operator.equals("<")){
            for (int i = 0 ; i <listInt.size() ; i++){
                if (listInt.get(i) < number){
                    filteredList.add(listInt.get(i));
                }
            }
        }else if (operator.equals(">")){
            for (int i = 0 ; i <listInt.size() ; i++){
                if (listInt.get(i) > number){
                    filteredList.add(listInt.get(i));
                }
            }
        }else if (operator.equals(">=")){
            for (int i = 0 ; i <listInt.size() ; i++){
                if (listInt.get(i) >= number){
                    filteredList.add(listInt.get(i));
                }
            }
        }else if (operator.equals("<=")){
            for (int i = 0 ; i <listInt.size() ; i++){
                if (listInt.get(i) <= number){
                    filteredList.add(listInt.get(i));
                }
            }
        }
        System.out.println(filteredList.toString().replace("[","").replace("]","").replace(",",""));
    }
}
