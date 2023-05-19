import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput="";
        int winCountUser=0;
        int lostCountUser=0;
        int drawCountUser=0;
        while (!userInput.equals("End")){
            System.out.println("Choose [R]ock/ [P]aper / [S]cissors?");
            userInput = scanner.nextLine();
            if (userInput.equals("End")){
                System.out.println("Thanks for playing!");
                break;
            }
            if (!userInput.equals("R") && !userInput.equals("P") && !userInput.equals("S")){
                System.out.println("Wrong input");
                return;
            }
            int userChoice = -1;
            switch (userInput){
                case "R" -> userChoice = 0;
                case "P" -> userChoice = 1;
                case "S" -> userChoice = 2;
                default -> userChoice = -1;
            }
            //pseud random int for the computer selection
            Random random = new Random();
            int computerChoice = random.nextInt(3);  // 0 = Rock, 1 = Paper, 2 = Scissors


            //game logic
            if (userChoice == 0 && computerChoice == 2 || userChoice == 1 && computerChoice == 0 || userChoice == 2 && computerChoice == 1){
                winCountUser++;
                System.out.println("User: " +userChoice);
                System.out.println("PC: " + computerChoice);
                System.out.println("Won Games: " +winCountUser);
                System.out.println("Lost Games: " +lostCountUser);
                System.out.println("Draw Games: " +drawCountUser);
                System.out.println(" .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .-----------------.");
                System.out.println("| .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. |");
                System.out.println("| |  ____  ____  | || |     ____     | || | _____  _____ | | | | _____  _____ | || |     _____    | || | ____  _____  | |");
                System.out.println("| | |_  _||_  _| | || |   .'    `.   | || ||_   _||_   _|| | | ||_   _||_   _|| || |    |_   _|   | || ||_   \\|_   _| | |");
                System.out.println("| |   \\ \\  / /   | || |  /  .--.  \\  | || |  | |    | |  | | | |  | | /\\ | |  | || |      | |     | || |  |   \\ | |   | |");
                System.out.println("| |    \\ \\/ /    | || |  | |    | |  | || |  | '    ' |  | | | |  | |/  \\| |  | || |      | |     | || |  | |\\ \\| |   | |");
                System.out.println("| |    _|  |_    | || |  \\  `--'  /  | || |   \\ `--' /   | | | |  |   /\\   |  | || |     _| |_    | || | _| |_\\   |_  | |");
                System.out.println("| |   |______|   | || |   `.____.'   | || |    `.__.'    | | | |  |__/  \\__|  | || |    |_____|   | || ||_____|\\____| | |");
                System.out.println("| |              | || |              | || |              | | | |              | || |              | || |              | |");
                System.out.println("| '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' |");
                System.out.println(" '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------' ");


            }else if(userChoice == computerChoice){
                drawCountUser++;
                System.out.println("User: " +userChoice);
                System.out.println("PC: " + computerChoice);
                System.out.println("Won Games: " +winCountUser);
                System.out.println("Lost Games: " +lostCountUser);
                System.out.println("Draw Games: " +drawCountUser);
                System.out.println(" .----------------.  .----------------.  .----------------.  .----------------. ");
                System.out.println("| .--------------. || .--------------. || .--------------. || .--------------. |");
                System.out.println("| |  ________    | || |  _______     | || |      __      | || | _____  _____ | |");
                System.out.println("| | |_   ___ `.  | || | |_   __ \\    | || |     /  \\     | || ||_   _||_   _|| |");
                System.out.println("| |   | |   `. \\ | || |   | |__) |   | || |    / /\\ \\    | || |  | | /\\ | |  | |");
                System.out.println("| |   | |    | | | || |   |  __ /    | || |   / ____ \\   | || |  | |/  \\| |  | |");
                System.out.println("| |  _| |___.' / | || |  _| |  \\ \\_  | || | _/ /    \\ \\_ | || |  |   /\\   |  | |");
                System.out.println("| | |________.'  | || | |____| |___| | || ||____|  |____|| || |  |__/  \\__|  | |");
                System.out.println("| |              | || |              | || |              | || |              | |");
                System.out.println("| '--------------' || '--------------' || '--------------' || '--------------' |");
                System.out.println(" '----------------'  '----------------'  '----------------'  '----------------' ");

            }else if (userChoice == 0 && computerChoice == 1 || userChoice == 1 && computerChoice == 2 || userChoice == 2 && computerChoice == 0) {
                lostCountUser++;
                System.out.println("User: " +userChoice);
                System.out.println("PC: " + computerChoice);
                System.out.println("Won Games: " +winCountUser);
                System.out.println("Lost Games: " +lostCountUser);
                System.out.println("Draw Games: " +drawCountUser);
                System.out.println(" .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------. ");
                System.out.println("| .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. |");
                System.out.println("| |  ____  ____  | || |     ____     | || | _____  _____ | | | |   _____      | || |     ____     | || |    _______   | || |  _________   | |");
                System.out.println("| | |_  _||_  _| | || |   .'    `.   | || ||_   _||_   _|| | | |  |_   _|     | || |   .'    `.   | || |   /  ___  |  | || | |_   ___  |  | |");
                System.out.println("| |   \\ \\  / /   | || |  /  .--.  \\  | || |  | |    | |  | | | |    | |       | || |  /  .--.  \\  | || |  |  (__ \\_|  | || |   | |_  \\_|  | |");
                System.out.println("| |    \\ \\/ /    | || |  | |    | |  | || |  | '    ' |  | | | |    | |   _   | || |  | |    | |  | || |   '.___`-.   | || |   |  _|  _   | |");
                System.out.println("| |    _|  |_    | || |  \\  `--'  /  | || |   \\ `--' /   | | | |   _| |__/ |  | || |  \\  `--'  /  | || |  |`\\____) |  | || |  _| |___/ |  | |");
                System.out.println("| |   |______|   | || |   `.____.'   | || |    `.__.'    | | | |  |________|  | || |   `.____.'   | || |  |_______.'  | || | |_________|  | |");
                System.out.println("| |              | || |              | || |              | | | |              | || |              | || |              | || |              | |");
                System.out.println("| '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' |");
                System.out.println(" '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------' ");


            }

        }
    }
}
