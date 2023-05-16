import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userInput = Integer.parseInt(scanner.nextLine());

        String output = "";
        if (userInput <0)
            return;

        if (userInput >= 0 && userInput <=2 ){
            output="baby";
        } else if (userInput <14) {
            output = "child";
        }else if (userInput <20) {
            output = "teenager";
        }else if (userInput <66) {
            output = "adult";
        }else if (userInput >=66) {
            output = "elder";
        }

        System.out.println(output);
    }
}
