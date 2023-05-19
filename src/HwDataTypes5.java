import java.util.Scanner;

public class HwDataTypes5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startIdx = Integer.parseInt(scanner.nextLine());
        int endIdx = Integer.parseInt(scanner.nextLine());

        for (int i = startIdx ; i <= endIdx ; i++){
            char charToPrint = (char) i;
            System.out.print(charToPrint + " ");
        }
    }
}
