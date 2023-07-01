package ObjectsClasses.Exercise;

import java.util.*;

public class OrderByAge_06 {
    static class PeopleByAge {
        private String name;
        private String ID;
        private  int age;

        public PeopleByAge(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PeopleByAge> peopleList = new ArrayList<>();

        while (true){
            String command = scanner.nextLine();

            if (command.contains("End")){
                break;
            }

            String[] commArr = command.split(" ");
            String name = commArr[0];
            String id = commArr[1];
            int age = Integer.parseInt(commArr[2]);

            PeopleByAge newPerson = new PeopleByAge(name,id,age);
            peopleList.add(newPerson);
        }

        Collections.reverse(peopleList);
        peopleList.sort(Comparator.comparingInt(PeopleByAge::getAge));

        for (PeopleByAge person : peopleList ){
            System.out.printf("%s with ID: %s is %d years old.%n",person.getName(),person.getID(),person.getAge());
        }
    }
}
