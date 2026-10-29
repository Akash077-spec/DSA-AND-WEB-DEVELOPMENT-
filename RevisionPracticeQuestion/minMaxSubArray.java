package RevisionPracticeQuestion;

public class minMaxSubArray {
    public static int getMax(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end =j;
                int currentsum = 0;
                for (int k = start; k <= end; k++) {
                    currentsum += numbers[k];

                }
                System.out.println("Sum is :" + currentsum);
                if (largest < currentsum) {
                    largest = currentsum;
                }if(smallest> currentsum){
                smallest= currentsum;
            }
            }
        }System.out.println("Largest number is:" + largest);
        System.out.println("Smallest  number is:" + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 7, 5, 3, 4, 6 };
         getMax(numbers);
        
    }
}
