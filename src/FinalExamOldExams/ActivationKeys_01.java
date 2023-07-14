package FinalExamOldExams;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        while (true){
            String commandArr = scanner.nextLine();
            if (commandArr.contains("Generate")){
                break;
            }

            String command = commandArr.split(">>>")[0];

            switch (command){
                case "Contains" :
                    String substringToSearch = commandArr.split(">>>")[1];
                    if(activationKey.indexOf(substringToSearch) != -1){
                        System.out.printf("%s contains %s%n",activationKey,substringToSearch);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip" :
                    String upperLower = commandArr.split(">>>")[1];
                    int startIdx = Integer.parseInt(commandArr.split(">>>")[2]);
                    int endIdx = Integer.parseInt(commandArr.split(">>>")[3]);
                    String replacement = activationKey.substring(startIdx,endIdx);

                    if(upperLower.contains("Upper") || upperLower.contains("upper")){
                        activationKey.replace(startIdx,endIdx,replacement.toUpperCase());
                    }else if (upperLower.contains("Lower") || upperLower.contains("lower")){
                        activationKey.replace(startIdx,endIdx,replacement.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice" :
                    int startIdx2 = Integer.parseInt(commandArr.split(">>>")[1]);
                    int endIdx2 = Integer.parseInt(commandArr.split(">>>")[2]);
                    activationKey.delete(startIdx2,endIdx2);
                    System.out.println(activationKey);
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Your activation key is: %s%n",activationKey);
    }
}
