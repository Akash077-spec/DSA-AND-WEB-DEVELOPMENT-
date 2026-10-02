package FunctionInJava;

import java.util.Scanner;

public class parameter {
    public static int sum(int num1, int num2) {//parameters in method creation
        int sum = num1 + num2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a :");
        int a = sc.nextInt();
        System.out.print("Enter value of b :");
        int b = sc.nextInt();

        System.out.println("Sum is : " + sum(a, b));//arguement while calling method
        sc.close();
    }
}
