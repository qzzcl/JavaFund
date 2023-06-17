package Lists.LIstsHW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<Integer> list = Arrays
                .stream(inputS.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String inputBomb = scanner.nextLine();
        String[] commandAsStr = inputBomb.split(" ");
        int bombNum = Integer.parseInt(commandAsStr[0]);
        int power = Integer.parseInt(commandAsStr[1]);

        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i) == bombNum){
                // remove indexes in the range: power + i + power. Start index = i-power. End index = i + power;
                int startIdx = Math.max(i - power, 0);
                int endIndx = Math.min(i + power, list.size() - 1);

                for (int z = startIdx ; z <= endIndx ; z++){
                    list.remove(z);
                    z--;
                    endIndx--;
                }
            }
        }
        int sum = 0;
        for (int e : list){
            sum += e;
        }
        System.out.println(sum);
    }
}
