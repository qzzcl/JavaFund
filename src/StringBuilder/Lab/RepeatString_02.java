package StringBuilder.Lab;

import java.util.Scanner;

public class RepeatString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] commInputArr = scanner.nextLine().split(" ");


        for (String word : commInputArr) {
            int size = word.length();
            System.out.print(word.repeat(size));
        }
//        System.out.println();
//
//        StringBuilder sb = new StringBuilder();
//
//        for ( String word : commInputArr) {
//            int sizeWord = word.length();
//
//            for (int i = 0; i < sizeWord; i++) {
//                sb.append(word);
//            }
//        }
//        System.out.print(sb);
    }
}
