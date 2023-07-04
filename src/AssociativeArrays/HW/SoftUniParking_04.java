package AssociativeArrays.HW;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, String> parkingDB = new LinkedHashMap<>();

        for (int i = 0; i < numEntries; i++) {
            String entryCommand = scanner.nextLine();
            String commandAction = entryCommand.split(" ")[0];
            String username = entryCommand.split(" ")[1];


            if(commandAction.equals("register")){
                String licensePlate = entryCommand.split(" ")[2];
                if(!parkingDB.containsKey(username)){
                    parkingDB.put(username,licensePlate);
                    System.out.printf("%s registered %s successfully%n",username,licensePlate);
                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n",licensePlate);
                }
            }else if(commandAction.equals("unregister")){
                if(!parkingDB.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n",username);
                }else{
                    System.out.printf("%s unregistered successfully%n",username);
                    parkingDB.remove(username);
                }
            }
        }
        for (Map.Entry<String, String> entry : parkingDB.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
