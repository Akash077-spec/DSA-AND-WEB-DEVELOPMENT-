package RevisionPracticeQuestion;

public class miaMaxInArray {
    public static int  getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }return largest;
    }
     public static int  getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 13, 78, 45, 15, 56, 78, 4 };
        System.out.println("Largest number is: " + getLargest(numbers));
        System.out.println("Smallest number is: " + getSmallest(numbers));
    }

}
