package Lists.ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int inputInt = Integer.parseInt(scanner.nextLine());

        List<String> listProducts = new ArrayList<>();

        for (int i = 0 ; i < inputInt; i++){
            String item = scanner.nextLine();
            listProducts.add(item);
        }

        //sort alphabetically
        Collections.sort(listProducts);
        int i = 1;
        for (String e : listProducts ){
            System.out.println(i + "." + e);
            i++;
        }
    }
}
