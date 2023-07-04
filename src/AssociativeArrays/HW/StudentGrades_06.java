package AssociativeArrays.HW;

import java.util.*;

public class StudentGrades_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentFile = new LinkedHashMap<>();

        for (int i = 0; i < numEntries; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentFile.containsKey(name)){
                studentFile.put(name,new ArrayList<>());
            }
            studentFile.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentFile.entrySet()) {
            double averageGrade = 0;
            for (Double grade: studentFile.get(entry.getKey())) {
                averageGrade += grade;
            }
            int totalGrades = studentFile.get(entry.getKey()).size();
            averageGrade /= totalGrades;
            if(averageGrade >= 4.5){
                System.out.printf("%s -> %.2f%n",entry.getKey(),averageGrade);
            }
        }

    }
}
