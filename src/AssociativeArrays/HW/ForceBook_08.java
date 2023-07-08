package AssociativeArrays.HW;

import java.util.*;

public class ForceBook_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, List<String>> forceSideM = new LinkedHashMap<>();

        while(true){
            String commandInput = scanner.nextLine();
            if(commandInput.equals("Lumpawaroo")){
                break;
            }

            String side ="";
            String name = "";

            if(commandInput.contains("|")){
                //first option: side | user
                side = commandInput.split(" \\| ")[0];
                name = commandInput.split(" \\| ")[1];

                //generate side if non existent
                forceSideM.putIfAbsent(side,new ArrayList<>());

                //add user to the side (only if non present)
                if (!isUserExistent(forceSideM,name)){
                    forceSideM.get(side).add(name);
                }
            }else{
                //second option: user -> side
                name = commandInput.split(" -> ")[0];
                side = commandInput.split(" -> ")[1];
                String finalName = name;

                //if user exists -> remove from whatever side he is currently on and change it to the current side passed in commnad
                if (isUserExistent(forceSideM,name)){
                    forceSideM.entrySet()
                            .forEach(sideEntry -> sideEntry.getValue().remove(finalName));     //remove
                    forceSideM.get(side).add(name);                                                         //add the user to current side
                }
                //if no such user exists anywhere, add him to the current side
                else{
                    forceSideM.putIfAbsent(side,new ArrayList<>());     //make sure there is such side
                    forceSideM.get(side).add(name);
                }
                System.out.printf("%s joins the %s side!%n",name,side);
            }
        }
        for (Map.Entry<String, List<String>> entry : forceSideM.entrySet()) {
            //check if users in the current key/side -> 0
            if (entry.getValue().size() <= 0){
                continue;
            }

            System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());

            //print users in the current key/side
            for (String user: forceSideM.get(entry.getKey())) {
                System.out.printf("! %s%n",user);
            }
        }

    }
    public static boolean isUserExistent ( Map<String,List <String>> forceSide, String name ){
        for (Map.Entry<String, List<String>> entry : forceSide.entrySet()) {
            //check if users in the current key/side -> 0
            if (entry.getValue().size() <= 0){
                continue;
            }

            //check if user exists in the currently selected list/value
            for (String user: forceSide.get(entry.getKey())) {
                if(name.equals(user)){
                    return true;
                }
            }
        }
        return false;
    }
}
