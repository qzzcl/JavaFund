import java.util.Scanner;

public class HwExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i < numEntries ; i ++){
            String userInputS = scanner.nextLine();

            //lootp thru the entry and find the white space
            for (int z = 0 ; z < userInputS.length()-1 ; z++){
                char ch = userInputS.charAt(z);
                if (ch == ' '){
                    long num1 = Long.parseLong(userInputS.substring(0,z));
                    long num2 = Long.parseLong(userInputS.substring(z+1,userInputS.length()));

                    if(num1 > num2){
                        System.out.printf("%s%n",sumDigits(num1));
                    }else {
                        System.out.printf("%s%n",sumDigits(num2));
                    }

                }
            }
        }
    }

    private static long sumDigits(long num){
        long sum = 0;
        long lastDigit=0;

        //turn to pos num for calc below
        if (num < 0){
            num *= (-1);
        }
        // -1  0
        //  0  0
        //case positive num
        while (num >= 1){
            lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }


        return sum;
    }
}
