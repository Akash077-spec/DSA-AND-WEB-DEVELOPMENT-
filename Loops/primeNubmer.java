package Loops;
import java.util.*;
public class primeNubmer {
    // code to check a prime number
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        for(int i =2;i<n;i++){
            if(n%i==0){
               isPrime=false;
                break;
            }
            

        } if(isPrime){
                System.out.println("Prime number");
            }else{
                System.out.println("Not a prime number");
            }sc.close();
    }
}
