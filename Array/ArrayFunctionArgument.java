package Array;

public class ArrayFunctionArgument {

    /*
     * METHOD 1: UPDATE ARRAY
     *
     * Logic:
     * - Traverse the complete array.
     * - Add the current index (i) to each element.
     * - Arrays can be modified inside a method.
     *
     * Example:
     * {12, 65, 62}
     * 12 + 0 = 12
     * 65 + 1 = 66
     * 62 + 2 = 64
     *
     * Result: {12, 66, 64}
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + i;
        }
    }


    /*
     * METHOD 2: COUNT ELEMENTS GREATER THAN TARGET
     *
     * Logic:
     * - Start count from 0.
     * - Traverse the complete array.
     * - Compare every element with target.
     * - If element > target, increase count.
     * - Return the final count.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int countGreater(int numbers[], int target) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > target) {
                count++;
            }
        }

        return count;
    }


    /*
     * METHOD 3: COUNT EVEN NUMBERS
     *
     * Logic:
     * - Start count from 0.
     * - Traverse the complete array.
     * - A number is even if number % 2 == 0.
     * - If even, increase count.
     * - Return the final count.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int countEven(int numbers[]) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {

        // ---------- Update Array ----------
        int marks[] = {12, 65, 62};

        update(marks);

        System.out.println("Updated Array:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();


        // ---------- Count Even Numbers ----------
        int numbers[] = {12, 7, 9, 20, 16, 5, 8};

        int result = countEven(numbers);

        System.out.println("Even numbers are: " + result);


        // ---------- Count Numbers Greater Than Target ----------
        int target = 20;

        int greater = countGreater(numbers, target);

        System.out.println(
            "Numbers greater than " + target + " are: " + greater
        );
    }
}