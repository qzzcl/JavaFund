package FinalExamOldExams;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        StringBuilder destinations = new StringBuilder (scanner.nextLine());

        while(true){
            String command = scanner.nextLine();
            if(command.equals("Travel")){
                System.out.printf("Ready for world tour! Planned stops: %s%n",destinations);
                break;
            }

            if (command.contains("Add")){
                int index = Integer.parseInt(command.split(":")[1]);
                String newDestination = command.split(":")[2];

                if (index >= 0 && index <= destinations.length() - 1 ){
                    destinations.insert(index,newDestination);
                }
                System.out.println(destinations);
            } else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                if (startIndex >= 0 && startIndex <= destinations.length() - 1  && endIndex >= 0 &&endIndex <= destinations.length() -1 ){
                    destinations.delete(startIndex,endIndex + 1);
                }
                System.out.println(destinations);
            } else if (command.contains("Switch")) {
                String oldString = command.split(":")[1];
                String newString = command.split(":")[2];

                //destinations = new StringBuilder(destinations.toString().replaceAll(oldString, newString));
                String destS = destinations.toString();
                String[] destArr = destS.split(":");

                for (int i = 0; i < destArr.length; i++) {
                    if(destArr[i].equals(oldString)){
                        destArr[i] = newString;
                    }
                }
                destinations = new StringBuilder();

                for (int i = 0; i < destArr.length ; i++) {
                    if(i < destArr.length -1){
                        destinations.append(destArr[i]+":");
                    }else {
                        destinations.append(destArr[i]);
                    }
                }
                System.out.println(destinations);
            }
        }
    }
}
