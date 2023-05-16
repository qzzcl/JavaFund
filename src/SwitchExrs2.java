public class SwitchExrs2 {
    public static void main(String[] args) {

        String month = "Jan";

        String quarter =
                switch (month){
                    case "Jan" -> "First Quarter";
                    case "Feb" -> "First Quarter";
                    case "Mar" -> "First Quarter";
                    case "Apr" -> "Second Quarter";
                    default -> "error";
                };
        //System.out.println(month + " is " + quarter);
        
        int quarterI = 
                switch (month){
                    case "Jan" -> 1;
                    case "Apr" -> 2;

                    default -> 0;
                };
        
        String quarter2;
        switch (month){
            case "Jan" -> quarter2 = "First Quarter";
            case "Apr" -> quarter2 = "Second Quarter";
            default -> quarter2 = "Error";
        }

        System.out.println(month + " is " + quarter);
        System.out.println(month + " is " + quarter2);
    }
}
