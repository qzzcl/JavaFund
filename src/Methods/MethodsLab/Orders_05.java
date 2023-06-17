package Methods.MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",calcCost(product,quantity));
    }
    private static double calcCost (String product, int quantity){
        double cost =0;
        switch (product){
            case "coffee" :
                cost = quantity * 1.5;
                break;
            case "water" :
                cost = quantity * 1;
                break;
            case "coke" :
                cost = quantity * 1.4;
                break;
            case "snacks" :
                cost = quantity * 2;
                break;
            default :
                break;
        }
        return cost;
    }
}
