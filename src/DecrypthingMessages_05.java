import java.util.Scanner;

public class DecrypthingMessages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int entries = Integer.parseInt(scanner.nextLine());
        String message = "";
        validateEntries(key, entries);


        for (int i = 0 ; i < entries ; i++){
            String characterStr = scanner.nextLine();
            //validate char entry
            if (validateChars(characterStr)){
                char ch = characterStr.charAt(0);
                int chInt = (int)ch + key;
                message += (char)chInt;
            }
        }
        System.out.println(message);
    }
    private static boolean validateChars(String charString){
        Scanner scanner = new Scanner (System.in);
        boolean isValid = false;
        while(!isValid){
           if (charString.length() == 1){
                char ch = charString.charAt(0);
                if (Character.isLetter(ch)){
                    isValid = true;
                    return true;
                }
            }
            charString = scanner.nextLine();
        }
        return true;
    }
    private static boolean validateEntries (int key, int entries){
        Scanner scanner = new Scanner (System.in);
        boolean isValid = false;
        //validate the key
        while (!isValid) {
            try {
                if (key < 0 || key > 20) {
                    //System.out.println("Invalid input. Please enter a value between 1 and 20.");
                    key = Integer.parseInt(scanner.nextLine());
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                //System.out.println("Invalid input. Please enter an integer value.");
            }
        }
        isValid = false;
        //validate the number of entries criteria
        while (!isValid) {
            try {
                if (entries < 1 || entries > 20) {
                    entries = Integer.parseInt(scanner.nextLine());
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {

            }
        }
        return true;
    }
}

/*
Constraints
• The key will be in the interval [0…20].
• n will be in the interval [1…20].
• The characters will always be upper or lower-case letters from the English alphabet.
• You will receive one letter per line.
 */
