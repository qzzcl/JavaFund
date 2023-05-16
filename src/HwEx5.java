import java.util.Scanner;

public class HwEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = reverseString(username);
        int attempts = 0;

        while (true) {
            String input = scanner.nextLine();
            attempts++;

            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (attempts == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}



