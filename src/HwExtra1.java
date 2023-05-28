import java.util.Scanner;

public class HwExtra1 {
    public static void main(String[] args) {
        //object 1 sc pointing to Scanner - user input
        Scanner sc = new Scanner(System.in);

        //collect the user input into var
        String input = sc.nextLine();

        while(!input.equals("END")){
            //new object that points to input var rather than System.in
            Scanner scanner = new Scanner(input);

            if (scanner.hasNextInt()){
                System.out.printf("%s is integer type%n", input);
            }else if (scanner.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
            }else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            }else if (scanner.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
            }else if (scanner.hasNextLine()) {
                System.out.printf("%s is string type%n", input);
            }
            //then change the vars content on each loop
            input = scanner.nextLine();
        }
    }

    /*
        //my sollution - works  partially
        while (true){
            String userInput = scanner.nextLine();
            String result = "";

            //check for end
            if (userInput.equals("END")){
                break;
            }
            //cover int and bool
            if (userInput.matches("^-?\\d+$")){
                result = "integer";
            } else if (userInput.matches("^-?\\d+\\.+\\d+$")) {
                result = "floating point";
            }else if (userInput.matches("true") || userInput.equals("false")) {
                result = "boolean";
            }else if (userInput.matches("^[a-zA-Z]+$") && userInput.length() > 1) {
                result = "string";
            }else if (userInput.length() == 1 && !userInput.matches("^-?\\d+$")){
                result = "character";
            }else {
                result = "unknown";
            }
            System.out.println(userInput + " is " + result + " type");
        }
    }
    */
}
//Data Type Finder