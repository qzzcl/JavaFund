package FinalExamOldExams;

import java.util.*;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String entryS = scanner.nextLine();

        String[] entrySplit = entryS.split("[\\|#]");
        StringBuilder foodListSB = new StringBuilder();

        Map<String,Integer> foodExpDate = new LinkedHashMap<>();
        Map<String,Double> foodCalories = new LinkedHashMap<>();


        System.out.println(foodListSB);

    }
}
