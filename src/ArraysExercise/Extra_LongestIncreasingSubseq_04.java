package ArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Extra_LongestIncreasingSubseq_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        //int[] nums = {7, 3, 5, 8, -1, 0, 6, 7};
        int n = nums.length;

        int[] len = new int[n]; // Holds the length of the LIS ending at each position
        int[] prev = new int[n]; // Holds the previous position for each element in the LIS

        // Initialize len[] and prev[] with default values
        Arrays.fill(len, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1; // Length of the longest increasing subsequence
        int lastIndex = 0; // Index of the last element in the LIS

        // Calculate len[] and prev[] using the given hints
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && len[j] + 1 > len[i]) {
                    len[i] = len[j] + 1;
                    prev[i] = j;
                }
            }

            if (len[i] > maxLength) {
                maxLength = len[i];
                lastIndex = i;
            }
        }

        // Restore the LIS starting from the position with maximal len[p]
        List<Integer> lis = new ArrayList<>();
        while (lastIndex >= 0) {
            lis.add(nums[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        // Reverse the LIS to get the correct order
        int lisLength = lis.size();
        for (int i = lisLength - 1; i >= 0; i--) {
            System.out.print(lis.get(i) + " ");
        }
    }
}
