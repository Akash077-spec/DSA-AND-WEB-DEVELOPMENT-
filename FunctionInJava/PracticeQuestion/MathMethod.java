package FunctionInJava.PracticeQuestion;

import java.util.Scanner;

public class MathMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Math.min()
        System.out.println("Minimum number: " + Math.min(num1, num2));

        // Math.max()
        System.out.println("Maximum number: " + Math.max(num1, num2));

        // Math.sqrt()
        System.out.println("Square root of first number: " + Math.sqrt(num1));

        // Math.pow()
        System.out.println("Power: " + Math.pow(num1, num2));

        // Average - Math.avg() does NOT exist in Java
        double average = (num1 + num2) / 2;
        System.out.println("Average: " + average);

        // Math.abs()
        System.out.println("Absolute value of first number: " + Math.abs(num1));

        sc.close();
    }
}