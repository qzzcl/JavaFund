import java.util.Scanner;

public class HwDataTypes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int litersInTank = 0;

        for (int i = 0; i < n; i++) {
            int litersToAdd = Integer.parseInt(scanner.nextLine());

            if (litersInTank + litersToAdd > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                litersInTank += litersToAdd;
            }
        }

        System.out.println(litersInTank);
    }
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());
        if (numEntries <1 || numEntries > 20){
            return;
        }
        int literesFilled = 0;

        int capacity = 255;
        for (int i = 0 ; i < numEntries ; i++){
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters < 1 || liters > 1000){
                continue;
            }

            if (literesFilled + liters < capacity){
                literesFilled += liters;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(literesFilled);
    }

     */
}

//Water overflow
