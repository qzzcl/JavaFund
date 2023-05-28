import java.util.Scanner;
// score in Jira 85 - there is a bug
public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());

        //input filter
        while (numEntries < 1 || numEntries > 20){
            numEntries = Integer.parseInt(scanner.nextLine());
        }

        boolean addTo1 = true;         //switch-flag
        String entry1="";
        String entry2="";
        //solution 1
        for (int i = 0 ; i < numEntries ; i++){
            String input = scanner.nextLine();
            //inp filter 2
            while (input.length() < 1 || input.length() > 100){
                input = scanner.nextLine();
            }
            if (input.length() == 1){
                if (input.equals("(") || input.equals(")")){
                     if(addTo1){
                         entry1 = input;
                         addTo1 = false;
                     }else{
                         entry2 = input;
                         addTo1 = true;
                    }
                }
            }
        }
        if (entry1.equals("(") && entry2.equals(")")){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}

// Solution 1- track and scan for single char; either ( or ).
// Solution 2 - scan the string regardless of the length and extract '(' or ')'

/*
Constraints
• n will be in the interval [1…20].
• The length of the stings will be between [1…100] characters.

 */
