package ArraysExercise;

import java.util.Scanner;

public class Extra_KaminoFactory_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        while(length < 1 || length > 100){
            length = Integer.parseInt(scanner.nextLine());
        }
        int[] bestSequence = new int[length];
        int bestSequenceIndex = -1;
        int bestSequenceSum = 0;
        int bestSequenceOnes = 0;
        int currentSequenceIndex = 0;
        int currentSequenceOnes = 0;
        int currentSequenceSum = 0;
        int currentSequenceStartPosition = -1;
        int bestSequenceStartIndex = -1; // Added variable declaration

        String input = scanner.nextLine();

        while (!input.equals("Clone them!")) {
            int[] currentDNA = parseDNASequence(input);

            currentSequenceIndex++;

            for (int i = 0; i < currentDNA.length; i++) {
                if (currentDNA[i] == 1) {
                    currentSequenceSum++;
                    currentSequenceOnes++;

                    if (currentSequenceStartPosition == -1) {
                        currentSequenceStartPosition = i;
                    }
                } else {
                    if (currentSequenceOnes > bestSequenceOnes ||
                            (currentSequenceOnes == bestSequenceOnes &&
                                    (currentSequenceStartPosition < bestSequenceStartIndex ||
                                            (currentSequenceStartPosition == bestSequenceStartIndex &&
                                                    currentSequenceSum > bestSequenceSum)))) {
                        bestSequence = currentDNA.clone();
                        bestSequenceIndex = currentSequenceIndex;
                        bestSequenceSum = currentSequenceSum;
                        bestSequenceOnes = currentSequenceOnes;
                        bestSequenceStartIndex = currentSequenceStartPosition;
                    }

                    currentSequenceOnes = 0;
                    currentSequenceSum = 0;
                    currentSequenceStartPosition = -1;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        System.out.println(joinDNASequence(bestSequence));
    }

    private static int[] parseDNASequence(String sequence) {
        String[] sequenceParts = sequence.split("!+");

        int[] dna = new int[sequenceParts.length];

        for (int i = 0; i < sequenceParts.length; i++) {
            dna[i] = Integer.parseInt(sequenceParts[i]);
        }

        return dna;
    }

    private static String joinDNASequence(int[] sequence) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sequence.length; i++) {
            sb.append(sequence[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
