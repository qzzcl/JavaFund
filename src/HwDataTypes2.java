import java.util.Scanner;

public class HwDataTypes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInp = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (userInp > 0){
            //step 1
            int lastDigit = userInp % 10;
            sum += lastDigit;

            //strip down last digit
            userInp /= 10;
        }
        System.out.println(sum);
    }
}
