package Array;

public class minMaxSubArray {

    public static void printMaxSubarray(int numbers[]) {

        // Store maximum and minimum subarray sums
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        // i selects starting index
        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            // j selects ending index
            for (int j = i; j < numbers.length; j++) {

                int end = j;

                // Reset sum for every new subarray
                int currentSum = 0;

                // Calculate sum from start to end
                for (int k = start; k <= end; k++) {

                    currentSum += numbers[k];
                }

                // Print sum of current subarray
                System.out.println("Current Sum = " + currentSum);

                // Update maximum sum
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                // Update minimum sum
                if (currentSum < minSum) {
                    minSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }

    public static void main(String args[]) {

        int numbers[] = {1, 45, 8, 85, 45};

        printMaxSubarray(numbers);
    }
}