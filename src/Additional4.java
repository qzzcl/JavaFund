import java.util.Scanner;

public class Additional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String reversed ="";
        for (int i = userInput.length()-1 ; i >= 0  ; i --){
            char latter = userInput.charAt(i);
            reversed += Character.toString(latter);
        }

        System.out.println(reversed);


    }
}

//REVERSE STRING
