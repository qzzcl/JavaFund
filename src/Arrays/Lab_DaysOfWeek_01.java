package Arrays;

import java.util.Scanner;

public class Lab_DaysOfWeek_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());

            //option 1 - declare, instantiate and initialize immediately
            String[] daysOfWeek = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

            //option 2- declare, and instantiate but no initialization
            //String[] daysOfWeek = new String[7];

            String output ="";

        /* NOT ACCEPTABLE BY JIRA
        for (int i = 0 ; i < daysOfWeek.length ; i++){
            switch (i){
                case 0 -> daysOfWeek[i] = "Monday";
                case 1 -> daysOfWeek[i] = "Tuesday";
                case 2 -> daysOfWeek[i] = "Wednesday";
                case 3 -> daysOfWeek[i] = "Thursday";
                case 4 -> daysOfWeek[i] = "Friday";
                case 5 -> daysOfWeek[i] = "Saturday";
                case 6 -> daysOfWeek[i] = "Sunday";
                default -> daysOfWeek[i] = "Invalid Day!";
            }
        }
         */

        /* PRACTICE SWITCH
            for (int i = 0 ; i < daysOfWeek.length ; i++){
                switch (i){
                    case 0 :
                        daysOfWeek[i] = "Monday";
                        break;
                    case 1 :
                        daysOfWeek[i] = "Tuesday";
                        break;
                    case 2 :
                        daysOfWeek[i] = "Wednesday";
                        break;
                    case 3 :
                        daysOfWeek[i] = "Thursday";
                        break;
                    case 4 :
                        daysOfWeek[i] = "Friday";
                        break;
                    case 5 :
                        daysOfWeek[i] = "Saturday";
                        break;
                    case 6 :
                        daysOfWeek[i] = "Sunday";
                        break;
                    default :
                        daysOfWeek[i] = "Invalid Day!";
                        break;
                }
            }
        */

         /*   not accepted by jira - PRACTICE SWITCH
        output= switch (input){
            case 1 -> output = daysOfWeek[0];
            case 2 -> output = daysOfWeek[1];
            case 3 -> output = daysOfWeek[2];
            case 4 -> output = daysOfWeek[3];
            case 5 -> output = daysOfWeek[4];
            case 6 -> output = daysOfWeek[5];
            case 7 -> output = daysOfWeek[6];
            default -> output = "Invalid day!";
        };

          */


        /* when the switch is placed inside the var it doesn't compile with "Break out of switch statement is now allowed"
        output = switch (input) {
            case 1:
                output = daysOfWeek[0];
                break;
            case 2:
                output = daysOfWeek[1];
                break;
            case 3:
                output = daysOfWeek[2];
                break;
            case 4:
                output = daysOfWeek[3];
                break;
            case 5:
                output = daysOfWeek[4];
                break;
            case 6:
                output = daysOfWeek[5];
                break;
            case 7:
                output = daysOfWeek[6];
                break;
            default:
                output = "Invalid day!";
                break;
        };
*/

            switch (input){
                case 1 :
                    output = daysOfWeek[0];
                    break;
                case 2 :
                    output = daysOfWeek[1];
                    break;
                case 3 :
                    output = daysOfWeek[2];
                    break;
                case 4 :
                    output = daysOfWeek[3];
                    break;
                case 5 :
                    output = daysOfWeek[4];
                    break;
                case 6 :
                    output = daysOfWeek[5];
                    break;
                case 7 :
                    output = daysOfWeek[6];
                    break;
                default :
                    output = "Invalid day!";
                    break;
            }
            System.out.println(output);
        }

        // ANOTHER PRINT OUT SOLUTION IS WITH FOR LOOP THROUGH THE STRING ARRAY

}
