import java.util.Scanner;

public class Additional5 {
    public static void main(String[] args) {
        //"NATIVE" solution using switch

        Scanner scanner = new Scanner(System.in);
        String finalMessage = "";
        int numEntries = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i < numEntries ; i ++){
            int userInputInt = Integer.parseInt(scanner.nextLine());

            String latter ="";

                    switch (userInputInt){
                case 2 :
                    latter = "a";
                    break;
                case 22 :
                    latter = "b";
                    break;
                case 222 :
                    latter = "c";
                    break;
                case 3 :
                    latter = "d";
                    break;
                case 33 :
                    latter = "e";
                    break;
                case 4 :
                    latter = "g";
                    break;
                case 44 :
                    latter = "h";
                    break;
                case 444 :
                    latter = "i";
                    break;
                case 5 :
                    latter = "j";
                    break;
                case 55 :
                    latter = "k";
                    break;
                case 555 :
                    latter = "l";
                    break;
                case 6 :
                    latter = "m";
                    break;
                case 66 :
                    latter = "n";
                    break;
                case 666 :
                    latter = "o";
                    break;
                case 7 :
                    latter = "p";
                    break;
                case 77 :
                    latter = "q";
                    break;
                case 777 :
                    latter = "r";
                    break;
                case 7777 :
                    latter = "s";
                    break;
                case 8 :
                    latter = "t";
                    break;
                case 88 :
                    latter = "u";
                    break;
                case 888 :
                    latter = "v";
                    break;
                case 9 :
                    latter = "w";
                    break;
                case 99 :
                    latter = "x";
                    break;
                case 999 :
                    latter = "y";
                    break;
                case 9999 :
                    latter = "z";
                    break;
                case 0 :
                    latter = " ";
                    break;
                default :
                    latter ="";
                    break;
            }

            finalMessage += latter;
        }
        System.out.println(finalMessage);

    }
}

//SMS emulator

/*
Hints
        • A native approach would be just putting all the possible combinations of digits in a giant switch statement.
        • A cleverer approach would be to come up with a mathematical formula that converts a number to its
        alphabet representation:
        Digit 2 3 4 5 6 7 8 9
        • Index• 0 1 2• 3 4 5• 6 7 8• 9 10 11 • 12 13
        14
        • 15 16 17
        18
        • 19 20
        21
        • 22 23 24
        25
        • Letter• a b c• d e f• g h i• j k l• m n o• p q r s • t u v • w x y z
        • Let's take the number 222 (c), for example. Our algorithm would look like this:
        o Find the number of digits the number has "e.g. 222 : 3 digits"
        o Find the main digit of the number "e.g. 222 : 2"
        o Find the offset of the number. To do that, you can use the formula: (main digit - 2) * 3
        o If the main digit is 8 or 9, we need to add 1 to the offset since the digits 7 and 9 have 4 letters each
        o Finally, find the letter index (a : 0, c : 2, etc.). To do that, we can use the following formula:
        (offset + digit length - 1).
        o After we've found the letter index, we can just add that to the ASCII code of the lowercase letter
        "a" (97)


 */