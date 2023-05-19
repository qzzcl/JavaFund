import java.util.Scanner;

public class Addtional2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInp = scanner.nextLine();

        System.out.println(digitToText(userInp));

    }
    /* new swtich statement
    public static String digitToText(String number){
        char lastSymbol = number.charAt(number.length()-1);
        String lastSymbolStr = Character.toString(lastSymbol);
        String text=switch (lastSymbolStr){
            case "1" -> text = "one";
            case "2" -> text = "two";
            case "3" -> text = "three";
            case "4" -> text = "four";
            case "5" -> text = "five";
            case "6" -> text = "six";
            case "7" -> text = "seven";
            case "8" -> text = "eight";
            case "9" -> text = "nine";
            case "0" -> text = "zero";

            default -> text = "Wrong";
        };

        return text;
    }
*/
    //old switch - FOR JUDGE
    public static String digitToText(String number){
        char lastSymbol = number.charAt(number.length()-1);
        String lastSymbolStr = Character.toString(lastSymbol);
        String text="";
        switch (lastSymbolStr){
            case "1" :
                text = "one";
                break;
            case "2" :
                text = "two";
                break;
            case "3" :
                text = "three";
                break;
            case "4" :
                text = "four";
                break;
            case "5" :
                text = "five";
                break;
            case "6" :
                text = "six";
                break;
            case "7" :
                text = "seven";
                break;
            case "8" :
                text = "eight";
                break;
            case "9" :
                text = "nine";
                break;
            case "0" :
                text = "zero";
                break;

            default :
                text = "Wrong";
                break;
        };

        return text;
    }
}


/*
2. English Name of the Last Digit
Write a method that returns the English name of the last digit of a given number. Write a program that reads an
integer and prints the returned value from this method.
Examples
Input Output
512 two
1 one
1643 three
 */
