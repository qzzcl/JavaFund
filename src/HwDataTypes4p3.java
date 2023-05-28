import java.util.Scanner;

public class HwDataTypes4p3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            int totalSum = 0;

            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                if (line.length() != 1 || !Character.isLetter(line.charAt(0))) {
                    System.out.println("Invalid input. Expected a single letter.");
                    return;
                }
                char ch = line.charAt(0);
                totalSum += ch;
            }

            System.out.printf("The sum equals: %d%n", totalSum);
        }
    }

