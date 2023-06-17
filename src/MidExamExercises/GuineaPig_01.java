package MidExamExercises;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodGr = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayGr = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverGr = Double.parseDouble(scanner.nextLine()) * 1000;
        double weightGPgr = Double.parseDouble(scanner.nextLine()) * 1000;

        for (int day = 1; day <= 30 ; day++){
            foodGr -= 300;

            if (day % 2 == 0){
                double fivePct = foodGr * 0.05;
                hayGr -= fivePct;
            }

            if(day % 3 == 0){
                coverGr -= weightGPgr * 0.333;
            }

            //check if all items are available or stop
            if (foodGr <= 0 || hayGr <= 0 || coverGr <= 0){
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodGr/1000,hayGr/1000,coverGr/1000);
    }
}
