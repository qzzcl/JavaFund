import java.util.Scanner;

public class Homework1Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keybaordPrice = Double.parseDouble(scanner.nextLine());
        double dispPrice = Double.parseDouble(scanner.nextLine());

        double totalExpense = 0;
        int keyboardTrashCount=0;
        int keyBoardTrashCountLast=0;

        //input range filters
        if (lostGames <0 || lostGames > 1000)
                return;
        if (headsetPrice <0 || headsetPrice > 1000)
            return;
        if (keybaordPrice <0 || keybaordPrice > 1000)
            return;
        if (dispPrice <0 || dispPrice > 1000)
            return;




        for (int i = 1 ; i <= lostGames ; i++){
            if(i % 2 == 0){                                 //codn 1 - every 2nd lost game - headset
                totalExpense += headsetPrice;
            }
            if(i % 3 == 0){                           //cond 2 - every 3rd lost g - mouse
                totalExpense += mousePrice;

            }
            if (i % 2 == 0 && i % 3 == 0) {
                totalExpense += keybaordPrice;
                keyboardTrashCount ++;
            }

            if (keyboardTrashCount != 0 && keyboardTrashCount % 2 == 0 && keyBoardTrashCountLast != keyboardTrashCount){
                totalExpense += dispPrice;
                keyBoardTrashCountLast = keyboardTrashCount;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalExpense);
    }
}
