import java.util.Scanner;

public class HomewordEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderCount = Integer.parseInt(scanner.nextLine());

        double total = 0.0;
        for (int i = 0; i < orderCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = (days * capsulesCount) * pricePerCapsule;
            total += orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }

        System.out.printf("Total: $%.2f", total);
    }
}

