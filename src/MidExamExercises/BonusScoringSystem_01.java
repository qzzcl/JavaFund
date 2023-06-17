package MidExamExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int courseBonus = Integer.parseInt(scanner.nextLine());
        List<Integer> bonusesList = new ArrayList<>();
        int highestBonus = 0;
        int attendancesToPrint=0;
        for (int i = 1 ; i <= studentsCount ; i++){
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            int attendances = Integer.parseInt(scanner.nextLine());
            double bonus = (double) attendances / lecturesCount * (5 + courseBonus);
            //bonusesList.add((int)Math.round(bonus));
            if (highestBonus < bonus){
                highestBonus = (int)Math.round(bonus);
                attendancesToPrint = attendances;
            }
        }
        System.out.printf("Max Bonus: %d.%n",highestBonus);
        System.out.printf("The student has attended %d lectures.",attendancesToPrint);
    }
}
