import java.util.Scanner;

public class HwDataTypes9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int startYieldDaily=0;
        int totalExtraction = 0;
        int daysCount = 0;

        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                startYieldDaily = Integer.parseInt(scanner.nextLine());
                if (startYieldDaily < 0 || startYieldDaily > 2147483647){
                    //System.out.println("Invalid input. Please enter a value between 1 and 20.");
                    startYieldDaily = Integer.parseInt(scanner.nextLine());
                } else {
                    isValidInput = true;
                }
            } catch (NumberFormatException e) {
                //System.out.println("Invalid input. Please enter an integer value.");
            }
        }


        while (startYieldDaily >= 100){
            daysCount++;
            totalExtraction += startYieldDaily -26;
            startYieldDaily -= 10;
            //totalExtraction -= 26;                                //- daily deduction
        }

        /*
        while (source >= 100) {
            days++;
            int spices = source - 26; //добив
            totalAmountSpices += spices;
            source -= 10;
        }
        */

        if(totalExtraction >= 26){
            totalExtraction -= 26;                                      //final deduction
        }
        System.out.println(daysCount);
        System.out.println(totalExtraction);

    }
}
