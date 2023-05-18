import java.util.Scanner;

public class Addtional2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInp = scanner.nextLine();

        //digitToText(userInp);

    }
/*
    public static String digitToText(String number){
        String lastSymbol = number.charAt(number.length()-1);
        String    text="";

        switch (lastSymbol){
            case "1" -> text = "one";
            default -> text = "Wrong";
        }
        return text;
    }
*/
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
