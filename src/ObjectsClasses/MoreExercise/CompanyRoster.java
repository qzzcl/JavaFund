package ObjectsClasses.MoreExercise;

import java.util.Scanner;

public class CompanyRoster {
    //Define a class Employee with the following information: name, salary, position, department, email, and age. The
    //name, salary, position, and department are mandatory, while the rest are optional.

    static class Employee {
        String name;
        int salary;
        String position;
        String dept;
        String email;
        String age;

        public Employee(String name, int salary, String position, String dept) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.dept = dept;
        }

        public Employee(String name, int salary, String position, String dept, String email, String age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.dept = dept;
            this.email = email;
            this.age = age;
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEmployees = Integer.parseInt(scanner.nextLine());
        double sumSalaries;
        double averageSalary;
        for (int i = 0 ; i < numEmployees; i++){

        }


    }
}
