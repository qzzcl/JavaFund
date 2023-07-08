package StringBuilder.Lab;

import java.util.Scanner;

public class DigitsLettersChars_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();

        StringBuilder lettersA = new StringBuilder();
        StringBuilder digitsA = new StringBuilder();
        StringBuilder charactersA = new StringBuilder();

        for (int i = 0; i < inputS.length(); i++) {
            char currentChar = inputS.charAt(i);
            if(Character.isLetter(currentChar)){
                lettersA.append(currentChar);
            }else if (Character.isDigit(currentChar)){
                digitsA.append(currentChar);
            }else{
                charactersA.append(currentChar);
            }
        }
        System.out.println(digitsA);
        System.out.println(lettersA);
        System.out.println(charactersA);
    }
}
