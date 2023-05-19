import java.util.Scanner;

public class HwDataTypes4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entries = Integer.parseInt(scanner.nextLine());
        if (entries < 1 || entries > 20){
            return;
        }
        int sumCharValues = 0;
        for (int i = 0 ; i < entries ; i ++){
            String letter = scanner.nextLine();
            //validate a-z A-Z
            if (((letter.length() == 1) && letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z') || (letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z')){
                char charLetter = letter.charAt(0);
                sumCharValues += charLetter;
            }
        }
        System.out.printf("The sum equals: %d",sumCharValues);
    }
}
