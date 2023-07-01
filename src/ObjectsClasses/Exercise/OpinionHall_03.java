package ObjectsClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionHall_03 {
    static class Person {
        String name;
        int age;

        public Person (String name, int age){
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());
        List<Person> listPersons = new ArrayList<>();

        for (int i = 0 ; i < numEntries ; i++){
            String command = scanner.nextLine();
            String[] commArr = command.split(" ");
            String nameInp = commArr[0];
            int ageInp = Integer.parseInt(commArr[1]);

            Person currentPerson = new Person(nameInp,ageInp);
            listPersons.add(currentPerson);
        }

        for (Person person : listPersons){
            int currentPersAge = person.getAge();
            String currentName = person.getName();

            if(currentPersAge >30){
                System.out.println(currentName + " - " + currentPersAge);
            }
        }
    }
}
