package Methods.MethodsLab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String textInp = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(textInp,repeatCount));
    }

    private static String repeatString(String text, int reapetNumber){
        String res="";
        for (int i = 0 ; i <reapetNumber ; i++){
            res += text;
        }
        return res;
    }
}
