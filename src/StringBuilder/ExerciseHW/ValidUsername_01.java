package StringBuilder.ExerciseHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsername_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] inputA = scanner.nextLine().split(", ");
        //StringBuilder listUsernames = new StringBuilder();
        List<String> listUsernames = new ArrayList<>();

        for (int i = 0; i < inputA.length; i++) {
            String currentUsername = inputA[i];
            if(checkUsernameValidity(currentUsername)){
                //listUsernames.append(currentUsername);
                listUsernames.add(currentUsername);
            }
        }
        for (String username : listUsernames) {
            System.out.println(username);
        }
    }
    public static boolean checkUsernameValidity(String username){
        if(username.length() < 3 || username.length() > 16){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char currentChar = username.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)){
                if(currentChar != '-' && currentChar != '_'){
                    return false;
                }
            }

        }
        return true;
    }
}
