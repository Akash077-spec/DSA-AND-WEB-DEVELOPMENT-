package practiceQuestion;
import java.util.Scanner;

public class question1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int A = sc.nextInt();
        System.out.print("Enter second number :");
        int B = sc.nextInt();
        System.out.print("Enterthird number :");
        int C = sc.nextInt();
        float sum = A + B + C;
        float average = sum / 3;
        System.out.println("Sum is :" + sum);
        System.out.println("Average is : " + average);
        sc.close();
    }
}