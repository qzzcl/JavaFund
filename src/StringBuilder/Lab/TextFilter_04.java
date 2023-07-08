package StringBuilder.Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        //String[] paragraph = scanner.nextLine().split("[, .]");
        String paragraph = scanner.nextLine();
        int[] lengthBannedWords = new int [bannedWords.length];

        for (int i = 0; i < bannedWords.length; i++) {
            lengthBannedWords[i] = bannedWords[i].length();
        }
        String asterix = "*";

        for (int i = 0 ; i < bannedWords.length ; i ++){
            paragraph = paragraph.replaceAll(bannedWords[i], asterix.repeat(lengthBannedWords[i]));
        }
        System.out.println(paragraph);
    }
}
