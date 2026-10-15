package Array;

public class Pairs {

    /*
     * PAIRS IN ARRAY
     *
     * Logic:
     * 1. Pick one element using outer loop.
     * 2. Inner loop starts from i + 1.
     * 3. Pair current element with all elements after it.
     * 4. This avoids duplicate and self pairs.
     *
     * Total Pairs = n * (n - 1) / 2
     *
     * Time Complexity  : O(n^2)
     * Space Complexity : O(1)
     */

    public static void arrayPairs(int numbers[]) {

        int count = 0;

        // Select current element
        for (int i = 0; i < numbers.length; i++) {

            int current = numbers[i];

            // Pair current with all elements after it
            for (int j = i + 1; j < numbers.length; j++) {

                System.out.print(
                    "(" + current + "," + numbers[j] + ") "
                );

                count++;
            }

            System.out.println();
        }

        System.out.println("Total count of pairs is : " + count);
    }

    public static void main(String[] args) {

        int numbers[] = {12, 78, 5, 6, 2, 4};

        arrayPairs(numbers);
    }
}