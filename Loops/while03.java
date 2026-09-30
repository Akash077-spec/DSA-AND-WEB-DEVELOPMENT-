package Loops;
import java.util.Scanner;
public class while03 {
    //sum of first N natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int i =1;
        int sum =0;
        while(i<=number){
            sum=sum+i;
            i++;
            

        }System.out.println(sum);
        sc.close();

        
    }
}
