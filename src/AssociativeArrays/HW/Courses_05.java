package AssociativeArrays.HW;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        LinkedHashMap<String, Integer> courseNumStudentsMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> courseStudNamesMap = new LinkedHashMap<>();

        while(true){
            String commandEntry = scanner.nextLine();
            if (commandEntry.equals("end")){
                break;
            }

            String courseName = commandEntry.split(" : ")[0];
            String studentName = commandEntry.split(" : ")[1];

            if(!courseStudNamesMap.containsKey(courseName)){
                courseStudNamesMap.put(courseName,new ArrayList<>());
                courseNumStudentsMap.put(courseName,0);
            }

            int lastNumStudents = courseNumStudentsMap.get(courseName);
            courseNumStudentsMap.put(courseName,lastNumStudents+1);
            courseStudNamesMap.get(courseName).add(studentName);
        }


        for (Map.Entry<String, Integer> entry : courseNumStudentsMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());

            for (Map.Entry<String, List<String>> name : courseStudNamesMap.entrySet()) {
                if(name.getKey().equals(entry.getKey())){
                    for (String studName : courseStudNamesMap.get(name.getKey())) {
                        System.out.printf("-- %s%n",studName);
                    }
                }
            }
        }

    }
}
