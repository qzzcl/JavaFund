import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = Integer.parseInt(scanner.nextLine());

        String month = switch (userInput){
            case 1 -> "January";
            case 2 -> "Feb";
            default -> "Error";
        };

        System.out.println(month);
    }
}
