import java.util.Scanner;

public class HwDataTypes3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int coursesNeeded = people % capacity == 0 ? people/capacity : people/capacity + 1;
        System.out.println(coursesNeeded);
    }
}
