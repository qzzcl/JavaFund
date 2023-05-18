import java.util.Scanner;
//sort inputs in descending order
public class Additional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int temp=0;

        if (a < b){
            temp = a;   //hold original a value
            a = b;
            b = temp;      // now A is larger than B (swapped)
        }
        if (a < c){
            temp = a;   //hold original a value
            a = c;
            c = temp;      // now A is larger than B (swapped)
        }
        if (b < c){
            temp = b;   //hold original B value
            b = c;
            c = temp;   //now B is larger than C
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
