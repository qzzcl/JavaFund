import java.util.Scanner;

public class HwDataTypes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        if ((n1 < -2147483648 || n1 > 2147483647) ||
            (n2 < -2147483648 || n2 > 2147483647) ||
            (n3 < -2147483648 || n3 > 2147483647) ||
            (n4 < -2147483648 || n4 > 2147483647)){
            return;
        }

        int sum = n1 + n2;
        int div = sum / n3;
        int mult = div * n4;

        System.out.println(mult);
    }
}
