package ObjectsClasses.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int numMessages = Integer.parseInt(scanner.nextLine());
        generateRandomMessage();
        for (int i = 0 ; i < numMessages; i++){
            System.out.println(generateRandomMessage());
        }
    }

    public static String generateRandomMessage(){
        String result="";

        List<String> listPhrases = Arrays.asList("Excellent product.",
                                                    "Such a great product.",
                                                    "I always use that product.",
                                                    "Best product of its category.",
                                                    "Exceptional product.",
                                                    "I can’t live without this product.");

        List<String> listEvents = Arrays.asList("Now I feel good.",
                                                "I have succeeded with this product.",
                                                "Makes miracles. I am happy of the results!",
                                                "I cannot believe but now I feel awesome.",
                                                "Try it yourself, I am very satisfied.",
                                                "I feel great!");

        List<String> listAuthors = Arrays.asList("Diana",
                                                "Petya",
                                                "Stella",
                                                "Elena",
                                                "Katya",
                                                "Iva",
                                                "Annie",
                                                "Eva");

        List<String> listCities = Arrays.asList("Burgas",
                                                "Sofia",
                                                "Plovdiv",
                                                "Varna",
                                                "Ruse");

        Random random = new Random();

        int randomPhraseIdx = random.nextInt(listPhrases.size()-1);
        int randomEventIdx= random.nextInt(listEvents.size()-1);
        int randomAuthorIdx = random.nextInt(listAuthors.size()-1);
        int randomCityIdx = random.nextInt(listCities.size()-1);

        result = listPhrases.get((int)randomPhraseIdx) + listEvents.get(randomEventIdx) + listAuthors.get(randomAuthorIdx) + " - " + listCities.get(randomCityIdx) ;

        return result;
    }
}
