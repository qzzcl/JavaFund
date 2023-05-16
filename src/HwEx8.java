import java.util.Scanner;

public class HwEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int userInp = Integer.parseInt(scanner.nextLine());

        for (int i = 1 ; i <= userInp ; i++){
            numberPrinter(i);
        }
    }

     static void  numberPrinter (int userInput){
        for (int i = 1 ; i <= userInput ; i++){
            System.out.print(userInput+" ");
        }
         System.out.println();
    }

}
