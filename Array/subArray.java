package Array;

public class subArray {

    /*
     * SUBARRAY LOGIC:
     *
     * 1. i selects the START index.
     * 2. j selects the END index.
     * 3. j starts from i because end cannot be before start.
     * 4. k prints elements from start to end.
     *
     * Total Subarrays = n * (n + 1) / 2
     *
     * Time Complexity  : O(n^3)
     * Space Complexity : O(1)
     */

    public static void printSubArray(int number[]) {
        int count=0;

        // Select starting index
        for (int i = 0; i < number.length; i++) {

            int start = i;

            // Select ending index
            for (int j = i; j < number.length; j++) {

                int end = j;

                // Print elements from start to end
                for (int k = start; k <= end; k++) {

                    System.out.print(number[k] + " ");
                    
                }count++;

                // Move to next line after each subarray
                System.out.println();
            }

            System.out.println();
        }System.out.println("Total count of subarray is :" + count);
    }

    public static void main(String[] args) {

        int number[] = {21, 45, 6, 7, 12, 33};

        printSubArray(number);
    }
}