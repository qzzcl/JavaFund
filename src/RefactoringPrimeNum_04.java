import java.util.Scanner;

public class RefactoringPrimeNum_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= input; i++) {
            boolean isTrue = true;
            for (int z = 2; z < i; z++) {
                if (i % z == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isTrue);
        }
    }
}
