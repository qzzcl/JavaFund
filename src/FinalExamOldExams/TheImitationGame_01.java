package FinalExamOldExams;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //String encryptedMessage = scanner.nextLine();
        StringBuilder encryptedMess = new StringBuilder(scanner.nextLine());

        while (true){
            String command = scanner.nextLine();
            if(command.equals("Decode")){

                break;
            }

            if(command.contains("Move")){
                int numLettersToMove = Integer.parseInt(command.split("\\|")[1]);
                String lettersToMove = encryptedMess.substring(0,numLettersToMove);
                encryptedMess.append(lettersToMove);
                encryptedMess.delete(0,numLettersToMove);

            }else if (command.contains("Insert")){
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];
                encryptedMess.insert(index,value);
                System.out.println();

            }else if(command.contains("ChangeAll")){
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];

//                //while there is a match if the substring we are looking for
//                while(encryptedMess.indexOf(substring) != -1){
//                    int index = encryptedMess.indexOf(substring);
//                    encryptedMess.replace(index,index+1,replacement);
//                }

                for (int i = 0; i < encryptedMess.length(); i++) {
                    String currentChar = String.valueOf(encryptedMess.charAt(i));

                    if(currentChar.equals(substring)){
                        encryptedMess.replace(i,i+1,replacement);
                    }
                }
            }
        }
        System.out.printf("The decrypted message is: %s%n",encryptedMess);
    }
}
