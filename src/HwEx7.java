import java.util.Scanner;

public class HwEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput="";
        double clientCapital = 0;
        double priceNuts = 2;
        double priceWater = 0.7;
        double priceCrisps = 1.5;
        double priceSoda = 0.8;
        double priceCoke = 1;

        //get client capital
        while (true){
            userInput =scanner.nextLine();
            if(userInput.equals("Start")){
                break;
            }
            double coin = Double.parseDouble(userInput);

            //check the coin
            if(isCoinValid(coin)){
                //parse to double and add
                clientCapital += coin;
            }
        }

        //get client products
        while (!userInput.equals("End")){
            userInput =scanner.nextLine();
            if (userInput.equals("End")){
                System.out.printf("Change: %.2f",clientCapital);
                break;
            }
            if(isProductValid(userInput)){
                if (userInput.equals("Water")){
                    if(clientCapital >= priceWater){
                        clientCapital -= priceWater;
                        System.out.printf("Purchased %s%n",userInput);
                    }else
                        System.out.printf("Sorry, not enough money%n");
                }else if (userInput.equals("Nuts")){
                    if(clientCapital >= priceNuts){
                        clientCapital -= priceNuts;
                        System.out.printf("Purchased %s%n",userInput);
                    }else
                        System.out.printf("Sorry, not enough money%n");
                }else if (userInput.equals("Crisps")){
                    if(clientCapital >= priceCrisps){
                        clientCapital -= priceCrisps;
                        System.out.printf("Purchased %s%n",userInput);
                    }else
                        System.out.printf("Sorry, not enough money%n");
                } else if (userInput.equals("Soda")){
                    if(clientCapital >= priceSoda){
                        clientCapital -= priceSoda;
                        System.out.printf("Purchased %s%n",userInput);
                    }else
                        System.out.printf("Sorry, not enough money%n");
                }else if (userInput.equals("Coke")){
                    if(clientCapital >= priceCoke){
                        clientCapital -= priceCoke;
                        System.out.printf("Purchased %s%n",userInput);
                    }else
                        System.out.printf("Sorry, not enough money%n");
                }

            }

        }

    }

    static boolean isCoinValid(double coin){
        if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
            return true;
        }else {
            System.out.printf("Cannot accept %.2f%n", coin);
            return false;
        }
    }
    static boolean isProductValid(String productInp){
        if (productInp.equals("Nuts") || productInp.equals("Water") ||
                productInp.equals("Crisps") || productInp.equals("Soda") || productInp.equals("Coke")){
            return true;
        }else{
            System.out.println("Invalid product");
            return false;
        }
    }


}
