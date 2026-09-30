package Loops;
import java.util.Scanner;
public class reverseNumber {
    // program to reverse the given number using while loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        while(number>0){
           int  lastDigit = number%10;
           System.out.println(lastDigit);
           number=number/10;
        }sc.close();
        System.out.println();
    }
}
