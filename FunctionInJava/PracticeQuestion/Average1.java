package FunctionInJava.PracticeQuestion;

import java.util.Scanner;

public class Average1 {
    public static void calculateAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter third number:");
        int num3 = sc.nextInt();
        float average = (float)(num1 + num2 + num3) / 3;
        System.out.println("Average is : " + average);
        sc.close();
    }

    public static void main(String args[]) {
        calculateAverage();

    }
}
