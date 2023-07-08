package StringBuilder.Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyToRemove = scanner.nextLine();
        String sentence = scanner.nextLine();

        while(sentence.contains(keyToRemove)){
            int startIndexOfKey = sentence.indexOf(keyToRemove);
            sentence = sentence.replace(keyToRemove,"");
        }
        System.out.println(sentence);
    }
}
