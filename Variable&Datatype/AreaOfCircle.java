import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[]){
        System.out.println("===== Area of circle =====");
        Scanner sc= new Scanner(System.in);
        float  pi=3.14f;
        System.out.print("Enter the value of radius : ");
        int radius =sc.nextInt();
        float  area = pi*radius*radius;
        System.out.println("Area of circle is :"+ area);
    }
}
