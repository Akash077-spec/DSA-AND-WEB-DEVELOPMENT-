package practiceQuestion;
import java.util.Scanner;
public class question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Calculating the are of square =====");
        System.out.print("Enter the side :");
        int side= sc.nextInt();
        int area = side*side;
        System.out.println("Area of square is " + area);
        sc.close();

    }
}
