import java.util.Scanner;

public class HomeworkEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capital = Double.parseDouble(scanner.nextLine());
        double numberStudents = Double.parseDouble(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());
        double totalCost = 0;
        double costPriceLight = 0;

       //condit 1 - calc the addon of 10 pct and calc the final cost
        int tenPctIncrease = (int) Math.ceil(numberStudents * 0.1);
        costPriceLight = priceLight * (numberStudents + tenPctIncrease);

        //cond 2 - belts
        // * how many free occurances (6th purchase is free), then substr from total cost
        int freeOcc = (int) Math.floor(numberStudents / 6);
        double costBelts = numberStudents * priceBelt - (freeOcc * priceBelt);

        totalCost = costPriceLight + costBelts + (numberStudents * priceRobe);

        //not enough $
        if (totalCost > capital){
            System.out.printf("George Lucas will need %.2flv more.", totalCost-capital);
        }else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }
    }
}
