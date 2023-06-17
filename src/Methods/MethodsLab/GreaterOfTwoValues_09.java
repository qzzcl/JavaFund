package Methods.MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String type = scanner.nextLine();

        //parse input to correct data type and pass it to getMax
        if (type.equals("int")){
            int entry1 = Integer.parseInt(scanner.nextLine());
            int entry2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(entry1,entry2));
        } else if (type.equals("char")) {
            char entry1 = scanner.nextLine().charAt(0);
            char entry2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(entry1,entry2));
        }else if (type.equals("string")) {
            String entry1 = scanner.nextLine();
            String entry2 = scanner.nextLine();
            System.out.println(getMax(entry1,entry2));
        }
    }

    private static int getMax (int entry1, int entry2){
        return Math.max(entry1, entry2);
    }

    private static char getMax (char entry1, char entry2){
        return entry1 > entry2 ? entry1 : entry2 ;
    }

    private static String getMax (String entry1, String entry2){
        return entry1.compareTo(entry2) >=0 ? entry1 : entry2;
    }

    /* solution 2 but not according to the descirption which requires methods overloading to be used
    private static void getMax(String type){
        Scanner scanner = new Scanner (System.in);

        if (type.equals("int")){
            int input1 = Integer.parseInt(scanner.nextLine());
            int input2 = Integer.parseInt(scanner.nextLine());
            System.out.println(input1 > input2 ? input1 : input2);
            //System.out.println(Math.max(input1, input2));
        } else if (type.equals("char")) {
            char input1 = scanner.nextLine().charAt(0);
            char input2 = scanner.nextLine().charAt(0);
            System.out.println(input1 > input2 ? input1 : input2);
        }else if (type.equals("string")) {
            int sumInput1 = 0;
            int sumInput2 = 0;
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            for (int i = 0 ; i <input1.length() ; i++){
                sumInput1 += input1.charAt(i);
                sumInput2 += input2.charAt(i);
            }
            System.out.println(sumInput1 > sumInput2 ? input1 : input2);
            //System.out.println(Math.max(sumInput1, sumInput2));
        }
    }

     */
}
