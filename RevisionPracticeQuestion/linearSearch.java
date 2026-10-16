package RevisionPracticeQuestion;

public class linearSearch {
    public static int linSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        int key = 5;
        int result = linSearch(numbers, key);
        if (result == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("key is found at index:" + result);
        }

    }
}
