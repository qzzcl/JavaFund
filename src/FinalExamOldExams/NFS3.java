package FinalExamOldExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NFS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int entryInt = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> carMileage = new LinkedHashMap<>();
        Map<String,Integer> carFuel = new LinkedHashMap<>();

        for (int i = 0; i < entryInt; i++) {
            String carInput = scanner.nextLine();
            String carName = carInput.split("\\|")[0];
            int miles = Integer.parseInt(carInput.split("\\|")[1]);
            int fuel = Integer.parseInt(carInput.split("\\|")[2]);

            carMileage.putIfAbsent(carName,miles);
            carFuel.putIfAbsent(carName,fuel);
        }

        while (true){
            String commandFull = scanner.nextLine();
            if(commandFull.contains("Stop")){
                break;
            }

            String command = commandFull.split(" : ")[0];
            String car = commandFull.split(" : ")[1];

            switch (command){
                case "Drive" :
                    int distance = Integer.parseInt(commandFull.split(" : ")[2]);
                    int fuel = Integer.parseInt(commandFull.split(" : ")[3]);

                    //if enough fuel to go the distance
                    if (carFuel.get(car) >= fuel){
                        carFuel.put(car,carFuel.get(car) - fuel);               //decrease fuel
                        carMileage.put(car,carMileage.get(car) + distance);     //increase mileage
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuel);
                    }else{
                        System.out.println("Not enough fuel to make that ride");
                    }

                    //check if car is for sale
                    if(carMileage.get(car) >= 100000){
                        carMileage.remove(car);
                        carFuel.remove(car);
                        System.out.printf("Time to sell the %s!%n",car);
                    }
                    break;

                case "Refuel" :
                    int refill = Integer.parseInt(commandFull.split(" : ")[2]);
                    int freeCapacityLiters = 75 - carFuel.get(car);
                    int currentFillLiters = carFuel.get(car);

                     if (freeCapacityLiters > 0){
                         if (refill > freeCapacityLiters){
                             //used refil = 75 - freeCapacity
                             System.out.printf("%s refueled with %d liters%n",car,75 - freeCapacityLiters);
                             //car will be filled up to 75
                             carFuel.put(car,75);
                         }else if (refill < freeCapacityLiters){
                             //used refil = refill
                             System.out.printf("%s refueled with %d liters%n",car,refill);
                             carFuel.put(car,carFuel.get(car) + refill);
                         }else {    //refuel == free capacity
                             System.out.printf("%s refueled with %d liters%n",car,refill);
                             carFuel.put(car,75);
                         }
                     }
                    break;

                case "Revert" :
                    int km = Integer.parseInt(commandFull.split(" : ")[2]);

                    carMileage.put(car,carMileage.get(car) - km);
                    if (carMileage.get(car) < 10000){
                        carMileage.put(car,10000);
                    }else{
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,km);
                    }
                    break;
                default:
                    break;
            }

        }

        for (Map.Entry<String, Integer> entry : carMileage.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : carFuel.entrySet()) {
                if(entry.getKey().equals(entry2.getKey())){
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(),entry.getValue(),entry2.getValue());
                }
            }
        }
    }
}
