package Methods.MethodsMoreExercise;

import java.util.Scanner;

public class LongerLine_03 {
    public static void main(String[] args) {
        closestFurthestXYEuclid();

    }
    private static void closestFurthestXYEuclid(){
        Scanner scanner = new Scanner(System.in);
        int[] line1Coordinates = new int[4];
        int[] line2Coordinates = new int[4];

        //fill coordinates from input
        for (int i = 0 ; i <line1Coordinates.length ; i++){                 //index: 0  1  2  3
            line1Coordinates[i] = Integer.parseInt(scanner.nextLine());     //format X1,Y1,X2,Y2 (pair 1)
        }
        for (int i = 0 ; i <line1Coordinates.length ; i++){
            line2Coordinates[i] = Integer.parseInt(scanner.nextLine());
        }

        //calc length of each line
        double line1Length = Math.sqrt(  Math.pow(line1Coordinates[2] - line1Coordinates[0],2) + Math.pow( line1Coordinates[3]-line1Coordinates[1],2)  );
        double line2Length = Math.sqrt(  Math.pow(line2Coordinates[2] - line2Coordinates[0],2) + Math.pow( line2Coordinates[3]-line2Coordinates[1],2)  );

        //PRINT CONSTRAINTS
        String line1FirstCloserToZero = "(" + line1Coordinates[0] + ", " + line1Coordinates[1] + ")" +
                                        "(" + line1Coordinates[2] + ", " + line1Coordinates[3] + ")";
        String line1SecondCloserToZero = "(" + line1Coordinates[2] + ", " + line1Coordinates[3] + ")" +
                                         "(" + line1Coordinates[0] + ", " + line1Coordinates[1] + ")";

        String line2FirstCloserToZero = "(" + line2Coordinates[0] + ", " + line2Coordinates[1] + ")" +
                                        "(" + line2Coordinates[2] + ", " + line2Coordinates[3] + ")";
        String line2SecondCloserToZero = "(" + line2Coordinates[2] + ", " + line2Coordinates[3] + ")" +
                                         "(" + line2Coordinates[0] + ", " + line2Coordinates[1] + ")";
        //  - print the longer line
        if (line1Length > line2Length){
            //print line 1
            //  - print the closer to 0 point first
            double line1Point1DistToZero = Math.sqrt(  Math.pow(line1Coordinates[0],2) + Math.pow( line1Coordinates[1],2)  );
            double line1Point2DistToZero = Math.sqrt(  Math.pow(line1Coordinates[1],2) + Math.pow( line1Coordinates[3],2)  );

            if (line1Point1DistToZero < line1Point2DistToZero){
                System.out.println(line1FirstCloserToZero);
            }else{
                System.out.println(line1SecondCloserToZero);
            }
        }else if (line1Length < line2Length){
            //print line 2
            //  - print the closer to 0 point first
            double line1Point1DistToZero = Math.sqrt(  Math.pow(line2Coordinates[0],2) + Math.pow( line2Coordinates[1],2)  );
            double line1Point2DistToZero = Math.sqrt(  Math.pow(line2Coordinates[1],2) + Math.pow( line2Coordinates[3],2)  );

            if (line1Point1DistToZero < line1Point2DistToZero){
                System.out.println(line2FirstCloserToZero);
            }else{
                System.out.println(line2SecondCloserToZero);
            }
        }
        //  - if lines are of equal length print only one of them
        else{
            System.out.println(line1FirstCloserToZero);
        }
    }
}
