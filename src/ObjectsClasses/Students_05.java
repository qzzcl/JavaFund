package ObjectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Students{
        String firstName;
        String lastName;
        int age;
        String homeTown;

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
                Students currentStudent = new Students(firstN,lasttN,age,city);
                studentsList.add(currentStudent);
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
}
