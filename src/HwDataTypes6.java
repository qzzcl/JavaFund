import java.util.Scanner;

public class HwDataTypes6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char letter1 = (char) ('a' + i);
                    char letter2 = (char) ('a' + j);
                    char letter3 = (char) ('a' + k);
                    System.out.println("" + letter1 + letter2 + letter3);
                }
            }
        }
    }
}

//Triples of Latin letters
