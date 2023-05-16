import java.util.Scanner;

public class HwEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0.0;

        switch (groupType) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        price = groupSize >= 30 ? (8.45 * groupSize * 0.85) : (8.45 * groupSize);
                        break;
                    case "Saturday":
                        price = groupSize >= 30 ? (9.80 * groupSize * 0.85) : (9.80 * groupSize);
                        break;
                    case "Sunday":
                        price = groupSize >= 30 ? (10.46 * groupSize * 0.85) : (10.46 * groupSize);
                        break;
                }
                break;

            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        if (groupSize >= 100) {
                            price = 10.90 * (groupSize - 10);
                        } else {
                            price = 10.90 * groupSize;
                        }
                        break;
                    case "Saturday":
                        if (groupSize >= 100) {
                            price = 15.60 * (groupSize - 10);
                        } else {
                            price = 15.60 * groupSize;
                        }
                        break;
                    case "Sunday":
                        if (groupSize >= 100) {
                            price = 16 * (groupSize - 10);
                        } else {
                            price = 16 * groupSize;
                        }
                        break;
                }
                break;

            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = groupSize >= 10 && groupSize <= 20 ? (15 * groupSize * 0.95) : (15 * groupSize);
                        break;
                    case "Saturday":
                        price = groupSize >= 10 && groupSize <= 20 ? (20 * groupSize * 0.95) : (20 * groupSize);
                        break;
                    case "Sunday":
                        price = groupSize >= 10 && groupSize <= 20 ? (22.50 * groupSize * 0.95) : (22.50 * groupSize);
                        break;
                }
                break;
        }

        System.out.printf("Total price: %.2f", price);
    }

}
