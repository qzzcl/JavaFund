package AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();

        List<String> listS = Arrays
                .stream(inputS.split(" "))
                .filter(e -> e.length() % 2 == 0)
                .collect(Collectors.toList());

        for (String e: listS) {
            System.out.println(e);
        }
    }
}
