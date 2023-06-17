package Lists.LIstsHW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> listInts = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = "";

        while (true){
            command = scanner.nextLine();
            String[] commandArr = command.split(" ");
            int element = 0;
            int position = 0;

            if (command.equals("end")){
                System.out.println(listInts.toString().replace("[","").replace("]","").replace(",",""));
                break;
            }else if (command.contains("Delete")){          //extract command elements
                element = Integer.parseInt(commandArr[1]);
                final int finalE = element;
                listInts.removeIf(n -> n == finalE);
            }else if (command.contains("Insert")){          //extract command elements
                element = Integer.parseInt(commandArr[1]);
                position = Integer.parseInt(commandArr[2]);
                listInts.add(position,element);
            }
        }
    }
}
