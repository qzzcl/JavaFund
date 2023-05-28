import java.util.Scanner;

public class HwDataTypes10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());   //poke power
        int distance = Integer.parseInt(scanner.nextLine());   // distance
        int factor = Integer.parseInt(scanner.nextLine());   // exhaustion Fact

        //if(n <1 || n > 2000000000)
        //    return;
        //if(m < 1 || m > 1000000)
        //    return;
        //if (y <0 || y >9)
        //    return;


        int countPokes = 0;
        int nOrig = power;

        while (power >= distance){
            power -= distance;
            countPokes++;
            if(power == nOrig/2){
                if (factor != 0){
                    power /= factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPokes);
    }
}
