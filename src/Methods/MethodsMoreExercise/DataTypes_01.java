package Methods.MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        //CAN'T USE IN JIRA
//        switch (command) {
//            case "int" -> dataTypeCalc(Integer.parseInt(scanner.nextLine()));
//            case "double" -> dataTypeCalc(Double.parseDouble(scanner.nextLine()));
//            case "string" -> dataTypeCalc(scanner.nextLine());
//            default -> command = scanner.nextLine();
//        }

        switch (command) {
            case "int" :
                dataTypeCalc(Integer.parseInt(scanner.nextLine()));
                break;
            case "real" :
                dataTypeCalc(Double.parseDouble(scanner.nextLine()));
                break;
            case "string" :
                dataTypeCalc(scanner.nextLine());
                break;
            default :
                command = scanner.nextLine();
                break;
        }

    }
    private static void dataTypeCalc(int intInput){
        System.out.println(intInput * 2);
    }private static void dataTypeCalc(double doubleInput){
        System.out.printf("%.2f%n",doubleInput * 1.5);
    }private static void dataTypeCalc(String stringInput){
        System.out.printf("$" + stringInput + "$");
    }
}
