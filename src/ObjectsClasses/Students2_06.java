package ObjectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_06 {
    static class Students{
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
//constr

        public Students(String firstName, String lastName, int age, String homeTown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String inputS;
        List<Students> studentsList = new ArrayList<>();

        while (true){
            inputS = scanner.nextLine();

            if(inputS.contains("end")){
                break;
            }else{
                //input students
                String[] commandArr = inputS.split(" ");
                String firstN = commandArr[0];
                String lasttN = commandArr[1];
                int age = Integer.parseInt(commandArr[2]);
                String city = commandArr[3];

                //if student doesn't exist add him to the list
                if (!isStudentExisting(studentsList,firstN,lasttN)){
                    Students currentStudent = new Students(firstN,lasttN,age,city);
                    studentsList.add(currentStudent);
                }else{
                    //if it already exists, override the info
                    Students existingStudent = getExistingStudent(studentsList,firstN,lasttN);
                    existingStudent.setFirstName(firstN);
                    existingStudent.setLastName(lasttN);
                    existingStudent.setAge(age);
                    existingStudent.setHomeTown(city);
                }
            }
        }
        //read the city name as filter
        inputS = scanner.nextLine();

        for (Students student : studentsList){
            String city = student.getHomeTown();
            if (city.equals(inputS)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }

    public static boolean isStudentExisting(List<Students> studentsList, String firstN, String lastN){
        for (Students student :  studentsList ){
            String firstName = student.getFirstName();
            String lastName = student.getLastName();

            if (firstName.equals(firstN) && lastName.equals(lastN)){
                return true;
            }
        }
        return false;
    }

    public static Students getExistingStudent (List<Students> studentsList, String firstN, String lastN){
        for (Students student :  studentsList ){
            String firstName = student.getFirstName();
            String lastName = student.getLastName();

            if (firstName.equals(firstN) && lastName.equals(lastN)){
                return student;
            }
        }
        return null;
    }
}
