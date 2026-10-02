package Loops.questionPractice;
import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
         int factorial=1;
        for(int i = 1;i<=number;i++){
           
            factorial=factorial*i;
           
            
        }System.out.println("factorial is :"+ factorial);
        sc.close();
        
    }
}
