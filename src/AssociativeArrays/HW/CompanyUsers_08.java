package AssociativeArrays.HW;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, List<String>> companyUsersM = new LinkedHashMap<>();

        while (true){
            String commandInput = scanner.nextLine();
            String companyName = commandInput.split("->")[0];
            if(companyName.equals("End")){
                break;
            }
            String employeeID = commandInput.split("->")[1];

            if (!companyUsersM.containsKey(companyName)){
                companyUsersM.put(companyName,new ArrayList<>());
            }
            if(!companyUsersM.get(companyName).contains(employeeID)){
                companyUsersM.get(companyName).add(employeeID);
            }
        }


//        companyUsersM.entrySet()
//                .forEach(entry -> {
//                    System.out.println(entry.getKey());
//                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
//                });

        for (Map.Entry<String, List<String>> entry : companyUsersM.entrySet()) {
                System.out.println(entry.getKey().trim());

                List <String> listEmployess = companyUsersM.get(entry.getKey());

            for (String employee : listEmployess) {
                System.out.printf("--%s%n",employee);
            }
        }

    }
}
