package StringBuilder.ExerciseHW;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder entryS = new StringBuilder(scanner.nextLine());   // C:\Internal\training-internal\Template.pptx
        //String entryS = scanner.nextLine();

        int indexEndName = 0;
        int indexStartName = 0;

        for (int i = entryS.length()-1 ; i >= 0 ; i--) {
            char currentChar = entryS.charAt(i);

            //everything to the right of the dot is file xtension, and to the left of the dot next to '\' is file name
            if(currentChar == '.'){
                indexEndName = i-1;
                continue;
            }
            if (currentChar == '\\') {
                indexStartName = i+1;
                break;
            }
        }
            String fileName = entryS.substring(indexStartName,indexEndName+1);
            String fileExtension = entryS.substring(indexEndName+2,entryS.length());
            System.out.printf("File name: %s%n",fileName);
            System.out.printf("File extension: %s%n",fileExtension);

    }


}
