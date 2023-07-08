package StringBuilder.ExerciseHW;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        StringBuilder entryS = new StringBuilder(scanner.nextLine());

        int addonStrenght = 0;

        for (int i = 0; i < entryS.length(); i++) {
            char currChar = entryS.charAt(i);

            if(currChar == '>'){
                char startIdx = entryS.charAt(i+1); //strenght/start index
                int strenghtNumCharsToRemove = Integer.parseInt(Character.toString(entryS.charAt(i + 1)));
                strenghtNumCharsToRemove += addonStrenght;

                while (strenghtNumCharsToRemove > 0){
                    char charToRemove = entryS.charAt(i+1);
                    int indexToRemove = entryS.indexOf(Character.toString(charToRemove),i);

                    if(charToRemove != '>'){
                        entryS.deleteCharAt(indexToRemove);
                        strenghtNumCharsToRemove--;
                        addonStrenght = 0;
                    }else{
                        char newStrengthChar = entryS.charAt(i+2);
                        int newStrengthToAdd = Integer.parseInt(Character.toString(entryS.charAt(i+2)));
                        addonStrenght = strenghtNumCharsToRemove;
                        strenghtNumCharsToRemove--;
                    }
                }
            }
        }
        System.out.println(entryS);

    }
}
