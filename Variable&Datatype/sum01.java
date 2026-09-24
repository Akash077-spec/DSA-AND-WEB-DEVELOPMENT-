import java.util.Scanner;
public class sum01 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of a : ");
       int a = sc.nextInt();
        System.out.print("Enter value of b : ");
       int b = sc.nextInt();

       int sum= a+b;
        int product= a*b;

       System.out.println(sum);
       System.out.println(product);
    }
}
