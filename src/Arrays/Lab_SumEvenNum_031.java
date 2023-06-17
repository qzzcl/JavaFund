package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_SumEvenNum_031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numAInput;
        numAInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int e : numAInput) {
            if (e % 2 == 0) {
                sum += e;
            }
        }
        System.out.println(sum);
    }
}
