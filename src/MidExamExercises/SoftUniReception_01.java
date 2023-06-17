package MidExamExercises;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int efficiencyE1 = Integer.parseInt(scanner.nextLine());
        int efficiencyE2 = Integer.parseInt(scanner.nextLine());
        int efficiencyE3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int totalEff = (efficiencyE1 + efficiencyE2 + efficiencyE3);

        int hours = 0;
        while(studentsCount > 0){
            hours++;
            if (hours % 4 == 0){
                continue;
            }
            studentsCount -= totalEff;
        }
        System.out.printf("Time needed: %dh.%n", hours);
    }
}
