package FinalExamOldExams;

import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numPieces = Integer.parseInt(scanner.nextLine());

        //"{piece}|{composer}|{key}". -- original input
        // {composer}|{piece}|{key} ---- will be saved like this. composer = key
        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();

        //fill the map
        for (int i = 0; i < numPieces; i++) {
            String[] entryS = scanner.nextLine().split("\\|");
            String piece = entryS[0];
            String composer = entryS[1];
            String key = entryS[2];

            pieceComposer.putIfAbsent(piece,composer);
            pieceKey.putIfAbsent(piece,key);
        }

        while(true){
            String entryS = scanner.nextLine();
            if(entryS.equals("Stop")){
                break;
            }

            String command = entryS.split("\\|")[0];
            String piece = entryS.split("\\|")[1];

            switch (command){
                //add piece composer key
                case "Add" :
                    String composer = entryS.split("\\|")[2];
                    String key = entryS.split("\\|")[3];

                    if(!pieceComposer.containsKey(piece)){
                        pieceComposer.putIfAbsent(piece,composer);
                        pieceKey.putIfAbsent(piece,key);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }else{
                        System.out.printf("%s is already in the collection!%n",piece);
                    }
                    break;
                case "Remove":
                    if(pieceComposer.containsKey(piece)){
                        pieceComposer.remove(piece);
                        pieceKey.remove(piece);
                        System.out.printf("Successfully removed %s!%n",piece);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = entryS.split("\\|")[2];
                    if(pieceComposer.containsKey(piece)){
                        pieceKey.replace(piece,newKey);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                    }
                    break;
                default:
                    break;
            }
        }
        //print all in this format:
        //"{Piece} -> Composer: {composer}, Key: {key}"

        for (Map.Entry<String, String> entry : pieceComposer.entrySet()) {
            for (Map.Entry<String, String> entryKeys : pieceKey.entrySet()) {
                if(entry.getKey() == entryKeys.getKey()){
                    System.out.println(entry.getKey() + " -> Composer: " + entry.getValue() + ", Key: " + entryKeys.getValue());
                }
            }
        }

    }
}
