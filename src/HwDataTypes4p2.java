import java.util.Scanner;

public class HwDataTypes4p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 1 || n > 20) {
            return;
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            if (line.length() != 1 || !Character.isLetter(line.charAt(0))) {
                return;
            }

            char letter = line.charAt(0);
            sum += letter;
        }

        System.out.println("The sum equals: " + sum);
    }
}
