package FunctionInJava.PracticeQuestion;

import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        int reverse = 0;
        int result = number;

        while (number > 0) {

            int lastDigit = number % 10;

            reverse = reverse * 10 + lastDigit;

            number = number / 10;
        }

        if (result == reverse) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}