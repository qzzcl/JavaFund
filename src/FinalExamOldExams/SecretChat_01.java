package FinalExamOldExams;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        StringBuilder hiddenMessage = new StringBuilder(scanner.nextLine());

        while(true){
            String command = scanner.nextLine();
            if(command.contains("Reveal")){
                break;
            }

            if(command.contains("Insert")){
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                hiddenMessage.insert(index," ");

                System.out.println(hiddenMessage);
            }
            else if (command.contains("Reverse")){
                String substring = command.split(":\\|:")[1];

                //check if substring lives in the original message
                if(hiddenMessage.indexOf(substring) != -1){
                    int startIndexCut = hiddenMessage.indexOf(substring);
                    int endIndexCut = startIndexCut + substring.length();

                    hiddenMessage = hiddenMessage.delete(startIndexCut,endIndexCut);
                    StringBuilder reversed = new StringBuilder(substring).reverse();
                    hiddenMessage.append(reversed);
                }else{
                    System.out.println("error");
                }
                System.out.println(hiddenMessage);
            } else if (command.contains("ChangeAll")) {
                String substring = command.split(":\\|:")[1];
                String replacementString = command.split(":\\|:")[2];

                hiddenMessage = new StringBuilder(hiddenMessage.toString().replaceAll(substring, replacementString));
                System.out.println(hiddenMessage);
            }
        }
        System.out.printf("You have a new text message: %s%n",hiddenMessage);
    }
}

/*
    heVVodar!gniV
        ChangeAll:|:V:|:l
        Reverse:|:!gnil
        InsertSpace:|:5
        Reveal

 */