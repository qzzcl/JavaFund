package StringBuilder.Lab;

import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        while (true){
            String commandInput = scanner.nextLine();
            String reversedStr = "";
            if(commandInput.equals("end")){
                break;
            }
            for (int i = commandInput.length()-1 ; i >= 0 ; i--) {
                reversedStr += commandInput.charAt(i);
            }
            System.out.println(commandInput + " = " + reversedStr);
        }
    }
}
