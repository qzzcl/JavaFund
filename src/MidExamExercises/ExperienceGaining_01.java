package MidExamExercises;

import java.util.Scanner;

public class ExperienceGaining_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double experienceRequired = Double.parseDouble(scanner.nextLine());
        double currentTotalExp = 0;
        int countBattles = Integer.parseInt(scanner.nextLine());
        int counter=0;
        for (int i = 1 ; i <= countBattles ; i++){
            double currentBattleExpGain = Double.parseDouble(scanner.nextLine());

            if(i % 3 == 0){
                currentBattleExpGain = currentBattleExpGain + (currentBattleExpGain * 0.15);
            }

            if(i % 5 == 0){
                currentBattleExpGain = currentBattleExpGain - (currentBattleExpGain * 0.10);
            }

            if(i % 15 == 0){
                currentBattleExpGain = currentBattleExpGain + (currentBattleExpGain * 0.05);
            }

            currentTotalExp += currentBattleExpGain;
            counter++;
            if (currentTotalExp >= experienceRequired ){
                System.out.printf("Player successfully collected his needed experience for %d battles.%n",counter);
                return;
            }
        }
        double missingExp = experienceRequired - currentTotalExp;
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.%n",missingExp);
    }
}
