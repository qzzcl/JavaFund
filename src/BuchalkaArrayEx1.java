import java.util.Arrays;
import java.util.Random;

public class BuchalkaArrayEx1 {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(5);
        System.out.println(Arrays.toString(randomArray));
    }

    //create method that gets an array and fills it with random numbers
    private static int[] getRandomArray (int len){
        Random random = new Random();
        int[] newArray = new int[len];

        for (int i = 0 ; i < len ; i++){
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }

}
