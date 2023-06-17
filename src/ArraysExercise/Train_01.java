package ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] peopleA = new int[wagons];
        int sumPeople =0;

        for (int i = 0 ; i < wagons ; i++){
            int people = Integer.parseInt(scanner.nextLine());
            peopleA[i] = people;
            sumPeople += people;
        }
        for (int i = 0 ; i < peopleA.length  ; i++){
            System.out.print(peopleA[i] + " ");
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
