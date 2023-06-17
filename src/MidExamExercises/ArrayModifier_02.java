package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true){
            String command = scanner.nextLine();
            if (command.equals("end")){

                break;
            }

            if (!command.equals("decrease")){
                String[] commArr = command.split(" ");
                int index1 = Integer.parseInt(commArr[1]);
                int index2 = Integer.parseInt(commArr[2]);

                if(command.contains("swap")){
                    int tempIdx1Val = listInts.get(index1);

                    listInts.set(index1,listInts.get(index2));
                    listInts.set(index2,tempIdx1Val);
                }else if(command.contains("multiply")){
                     int newVal = listInts.get(index1) * listInts.get(index2);
                     listInts.set(index1,newVal);
                }
            }else{
                //the decrease command , all -1
                for (int i = 0 ; i <listInts.size() ; i++){
                    listInts.set(i,listInts.get(i) -1);
                }
            }
        }
        System.out.println(listInts.toString()
                                    .replace("[","")
                                    .replace("]",""));
    }
}
