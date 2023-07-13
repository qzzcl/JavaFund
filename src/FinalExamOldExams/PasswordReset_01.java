package FinalExamOldExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        StringBuilder originalMessage = new StringBuilder(scanner.nextLine());

        while(true){
            String commandArr = scanner.nextLine();
            if(commandArr.contains("Done")){
                break;
            }

            String command = commandArr.split(" ")[0];

            switch (command){
                case "TakeOdd" :
                    List<Character> newPass = new ArrayList<>();

                    for (int i = 1; i < originalMessage.length(); i=i+2) {
                        newPass.add(originalMessage.charAt(i));
                    }
                    String replace = newPass.toString().replace("[", "")
                            .replace("]", "")
                            .replace(",", "")
                            .replace(" ", "");
                    System.out.println(replace);

                    originalMessage = new StringBuilder(replace);
                    break;
                case "Cut" :
                    int index = Integer.parseInt(commandArr.split(" ")[1]);
                    int length = Integer.parseInt(commandArr.split(" ")[2]);

                    originalMessage.delete(index,index+length);
                    System.out.println(originalMessage);
                    break;
                case "Substitute" :
                    String findSubstr = commandArr.split(" ")[1];
                    String replacementStr = commandArr.split(" ")[2];

                    if(originalMessage.indexOf(findSubstr) != -1){
                        String replacedPass = originalMessage.toString().replaceAll(findSubstr,replacementStr);
                        System.out.println(replacedPass);
                        originalMessage = new StringBuilder(replacedPass);
                    }else{
                        System.out.println("Nothing to replace!");
                    }

                    break;
                default:
                    break;
            }
        }
        System.out.printf("Your password is: %s%n",originalMessage);
    }
}
