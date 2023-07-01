package ObjectsClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {
    public static class VehiclesCatalogue {
        String type;
        String model;
        String color;
        double horsePower;

        public VehiclesCatalogue(String type, String model, String color, double horsePower) {
            this.type = capitalizeFirstLetter(type);
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getModel() {
            return this.model;
        }

        public String getType() {
            return type;
        }

        public String getColor() {
            return color;
        }

        public double getHorsePower() {
            return horsePower;
        }

        private String capitalizeFirstLetter(String str) {
            if (str.isEmpty()) {
                return str;
            }
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<VehiclesCatalogue> listVehicles = new ArrayList<>();

        double sumCarsHP = 0;
        double sumTrucksHP = 0;
        int counterCars=0;
        int counterTrucks=0;

        while(true){
            String command = scanner.nextLine();
            if (command.contains("End")){
                break;
            }

            String[] commArr = command.split(" ");
            String type = commArr[0];
            String model = commArr[1];
            String color = commArr[2];
            double hP = Double.parseDouble(commArr[3]);

            //add to the catalogue
            VehiclesCatalogue newVehicle = new VehiclesCatalogue(type,model,color,hP);
            listVehicles.add(newVehicle);
            if(type.contains("car")){
                sumCarsHP += hP;
                counterCars++;
            }else{
                sumTrucksHP += hP;
                counterTrucks++;
            }
        }

        while(true){
            String model = scanner.nextLine();
            if (model.contains("Close the Catalogue")){
                break;
            }
            for (VehiclesCatalogue vehicle : listVehicles){
                String currentSelectionModel = vehicle.getModel();
                if (currentSelectionModel.equals(model)){
                    System.out.println("Type: " + vehicle.getType());
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.printf("Horsepower: %.0f%n",vehicle.getHorsePower());
                }
            }
        }
        if (sumCarsHP == 0 && counterCars == 0){
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        }else{
            System.out.printf("Cars have average horsepower of: %.2f.%n",sumCarsHP/(counterCars * 1.0));
        }

        if (sumTrucksHP == 0 && counterTrucks == 0) {
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        }else{
            System.out.printf("Trucks have average horsepower of: %.2f.%n",sumTrucksHP/(counterTrucks * 1.0));
        }
    }
}
