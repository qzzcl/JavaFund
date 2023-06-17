package ArraysExercise;

import java.util.Scanner;

public class Extra_EncryptSortPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());
        String[] entriesA = new String[numEntries];
        int[] sumA = new int[numEntries];
        for (int i = 0 ; i < numEntries; i++){
            entriesA[i] = scanner.nextLine();
        }

        //encrypt

        for (int i = 0 ; i < entriesA.length; i++){
            int sum=0;
            int vowsRes=0;
            int consRes=0;

            for (int z = 0 ; z < entriesA[i].length(); z++){
                char currentChar = entriesA[i].charAt(z);

                if (isCharVow(currentChar)){
                    vowsRes += currentChar * entriesA[i].length();
                }else{
                    consRes += currentChar / entriesA[i].length();
                }
            }
            sum = vowsRes + consRes;
            sumA[i] = sum;
        }
        //sort
        boolean sorted = false;
        int n = sumA.length;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (sumA[i] > sumA[i + 1]) {
                    int temp = sumA[i];
                    sumA[i] = sumA[i + 1];
                    sumA[i + 1] = temp;
                    sorted = false;
                }
            }
            n--;
        }

        for(int e : sumA){
            System.out.println(e);
        }
    }


    private static boolean isCharVow(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

}
