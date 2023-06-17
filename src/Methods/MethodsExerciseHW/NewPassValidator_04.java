package Methods.MethodsExerciseHW;

import java.util.Scanner;

public class NewPassValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        int len = input.length();
        if(!passCheckCharLen(input)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!passCheckDigLetter(input)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!passCheckMinDigits(input)){
            System.out.println("Password must have at least 2 digits");
        }

//        System.out.println(passCheckCharLen(input) ? "" : "Password must be between 6 and 10 characters");
//        System.out.println(passCheckDigLetter(input) ? "" : "Password must consist only of letters and digits");
//        System.out.println(passCheckMinDigits(input) ? "" : "Password must have at least 2 digits");

        if (passCheckCharLen(input) && passCheckDigLetter(input) && passCheckMinDigits(input)){
            System.out.println("Password is valid");
        }
    }
    private static boolean passCheckCharLen(String input){
        //rule 1 - 6-10 characters
        if (input.length() < 6 || input.length() > 10){
            //System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    private static boolean passCheckDigLetter(String input){
        //rule 2 - contains only digits and letters -> solution using ASCI codes
        int externalCounter = 0;
        for (int i =0  ; i <input.length() ; i++){
            char currentChar = input.charAt(i);
            //is it a digit or letter?
            if (!Character.isLetterOrDigit(currentChar)){
                //System.out.println("Password must consist only of letters and digits");
                return false;
            }
            //externalCounter++;
        }
//        if (externalCounter < input.length()-1){
//            return false;
//        }
        return true;
    }

    private static boolean passCheckMinDigits(String input){
        //rule 3 - check if it contains at least 2 digits
        int digits = 0;
        for (int i =0  ; i <input.length() ; i++){
            char currentChar = input.charAt(i);
            //is it a digit or letter?
            if (Character.isDigit(currentChar)){
                digits++;
            }
            if (digits >2){
                break;
            }
        }
        if (digits < 2){
            //System.out.println("Password must have at least 2 digits");
            return false;
        }else {
            return true;
        }
    }
}
