package RevisionPracticeQuestion;

public class binary {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 60;
        int result = binarySearch(numbers, key);
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is found at index:" + result);
        }

    }
}
