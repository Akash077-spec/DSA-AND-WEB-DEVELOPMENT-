package Loops;
import java.util.Scanner;
public class while02 {
    // print number 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int i =1;
        while(i<=num){
            System.out.println(i);
            i++;
        }sc.close();
    }
}
