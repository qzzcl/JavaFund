package MidExamExercises;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int plunderDaily = Integer.parseInt(scanner.nextLine());
        double targetPlunder = Double.parseDouble(scanner.nextLine());
        double totalPlunder=0;
        for (int i = 1 ; i <= days ; i++){
            totalPlunder += plunderDaily;

            if(i % 3 == 0){
                double extraPlunder = (plunderDaily * 0.5);
                totalPlunder += extraPlunder;
            }

            if(i % 5 == 0){
                double lostPlunder = totalPlunder * 0.3;
                totalPlunder -= lostPlunder;
            }
        }
        if(totalPlunder >= targetPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",totalPlunder);
        }else{
            double plunderCollPct = (totalPlunder/targetPlunder)*100;
            System.out.printf("Collected only %.2f%% of the plunder.",plunderCollPct);
        }
    }
}
