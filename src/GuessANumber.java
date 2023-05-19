import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(101);
        int userGuess = -1;
        System.out.println("Game Settings -> Enter max guess attempts:");
        int maxAttempts = Integer.parseInt(scanner.nextLine());
        System.out.println("You have "+ maxAttempts + " attempts to guess the number! Good luck!");
        while (userGuess != randomNum){
            System.out.println("Enter a number b/w 0 and 100:");
            userGuess = Integer.parseInt(scanner.nextLine());
            if (userGuess == randomNum){
                System.out.println("Correct, you WIN!");
            }else if (userGuess < randomNum){
                System.out.println("Too low");
            } else if (userGuess > randomNum) {
                System.out.println("Too high");
            }
            maxAttempts--;
            if (maxAttempts == 0){
                System.out.println("Sorry you lose!");
            }
        }
    }
}
