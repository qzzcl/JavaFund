import java.util.Scanner;

public class HwDataTypes8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEntries = Integer.parseInt(scanner.nextLine());
        //check limit for n
        if (numEntries >10){
            return;
        }
        String largestKeg ="";
        float lastKegVol = 0;
        for (int i = 0 ; i < numEntries ; i++){
            float pi = (float)Math.PI;
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            //check upper and lower limits of the entries
            if (radius < 1 || radius >3.402823E+38){
                return;
            }
            if (height < 1 || height > 2147483647){
                return;
            }

            //calc - Calculate the volume using the following formula: π * r^2 * h.
            float volume = pi * (radius*radius) * height;

            if (volume > lastKegVol){
                lastKegVol = volume;
                largestKeg = model;
            }
        }
        System.out.println(largestKeg);
    }


}
//Beer Kings