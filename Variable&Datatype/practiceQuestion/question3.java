package practiceQuestion;

import java.util.Scanner;

public class question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil:");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen:");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser:");
        float eraser = sc.nextFloat();
        float sum = pencil + pen + eraser;
        float GST = (18 / sum) * 100;
        System.out.println("Total cost is :" + sum);
        System.out.println("GST applied on product is 18 % : " + GST);
        sc.close();

    }
}
