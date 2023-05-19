import java.util.Scanner;

public class HwDataTypes11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (n < 0 || n > 100)
            return;

        double value = 0;
        double highestValue = 0;
        int highestSnow = 0;
        int highestTime =0;
        int highestQual =0;

        for (int i = 0 ; i < n ; i++){
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int qual = Integer.parseInt(scanner.nextLine());
            if (snow < 0 || snow > 1000)
                return;
            if (time < 1 || time > 500)
                return;
            if (qual < 0 || qual > 100)
                return;

            //value = (snow / time) * (int)Math.sqrt(qual);
            value = Math.pow(snow / time, qual);
            if (value > highestValue){
                highestValue = value;
                highestSnow = snow;
                highestTime = time;
                highestQual = qual;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",highestSnow,highestTime,highestValue,highestQual);
        //"{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})"
    }
}
