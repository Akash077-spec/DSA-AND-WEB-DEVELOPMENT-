package Array;

public class binarysearch {

    /*
     * BINARY SEARCH
     *
     * Logic:
     * 1. Binary Search works only on a SORTED array.
     * 2. Start with the complete array:
     *      start = 0
     *      end = length - 1
     *
     * 3. Find middle index:
     *      mid = (start + end) / 2
     *
     * 4. Compare number[mid] with key:
     *
     *      number[mid] == key
     *          -> Key found, return mid
     *
     *      number[mid] > key
     *          -> Key is smaller
     *          -> Search LEFT side
     *          -> end = mid - 1
     *
     *      number[mid] < key
     *          -> Key is bigger
     *          -> Search RIGHT side
     *          -> start = mid + 1
     *
     * 5. If start > end:
     *      -> Key does not exist
     *      -> return -1
     *
     * Time Complexity  : O(log n)
     * Space Complexity : O(1)
     */

    public static int binarySearch(int number[], int key) {

        // First index of the search area
        int start = 0;

        // Last index of the search area
        int end = number.length - 1;

        // Continue searching while a valid search area exists
        while (start <= end) {

            // Find middle index
            int mid = start + (end - start) / 2;

            // Case 1: Key found
            if (number[mid] == key) {
                return mid;
            }

            // Case 2: Key is smaller than middle element
            // Search in the LEFT half
            if (number[mid] > key) {
                end = mid - 1;
            }

            // Case 3: Key is greater than middle element
            // Search in the RIGHT half
            else {
                start = mid + 1;
            }
        }

        // Key was not found in the array
        return -1;
    }

    public static void main(String[] args) {

        // IMPORTANT: Array must be sorted for Binary Search
        int number[] = {12, 33, 43, 333, 354, 564};

        int key = 12;

        int index = binarySearch(number, key);

        // Check whether key was found
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}//


// //number[mid] == key  → FOUND

// number[mid] > key   → LEFT  → end = mid - 1

// number[mid] < key   → RIGHT → start = mid + 1