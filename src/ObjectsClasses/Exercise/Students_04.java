package ObjectsClasses.Exercise;

import java.util.*;

public class Students_04 {
    static class Students {
        String firstName;
        String lastName;
        double grade;

        public Students(String firstName, String lastName, double grade){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());
        List<Students> listStudents = new ArrayList<>();

        for (int i = 0; i < numEntries ; i++){
            String studentInput = scanner.nextLine();
            String[] studentInpArr = studentInput.split(" ");
            String firstN = studentInpArr[0];
            String lastN = studentInpArr[1];
            double grade = Double.parseDouble(studentInpArr[2]);

            Students newStudent = new Students(firstN,lastN,grade);
            listStudents.add(newStudent);
        }

        //order listStudents in descending order (by grade)
        listStudents.sort(Comparator
                            .comparingDouble(Students::getGrade)
                            .reversed());

        for (Students student : listStudents ){
            System.out.printf("%s %s: %.2f%n",student.getFirstName(), student.getLastName(),student.getGrade());
        }
    }
}
