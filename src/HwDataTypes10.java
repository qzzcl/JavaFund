import java.util.Scanner;

public class HwDataTypes10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());   //poke power
        if(n <1 || n > 2000000000)
            return;
        int m = Integer.parseInt(scanner.nextLine());   // distance
        if(m < 1 || m > 1000000)
            return;
        int y = Integer.parseInt(scanner.nextLine());   // exhaustion Fact
        if (y <0 || y >9)
            return;
        int countPokes = 0;
        int nOrig = n;

        while (n >= m){
            n -= m;
            countPokes++;
            if(n == nOrig/2){
                //if (n % y == 0){
                    n /= y;
                //}
            }
        }
        System.out.println(n);
        System.out.println(countPokes);
    }
}
