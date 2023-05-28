import java.util.Scanner;

public class HwDataTypes4p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int inputI = Integer.parseInt(scanner.nextLine());

        //if (inputI <1 || inputI > 20)
        //    return;
        int sum = 0;
        for (int i = 0 ; i < inputI ; i++){
            char ch = scanner.nextLine().charAt(0);
            //if (!Character.isLetter(ch)){
            //    continue;
            //}
            sum +=  ch;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
