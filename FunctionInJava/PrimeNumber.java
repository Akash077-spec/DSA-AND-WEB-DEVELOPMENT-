package FunctionInJava;
import java.util.Scanner;
public class PrimeNumber {
    public static void primeCheck(int n){
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        for(int i =2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }if(isPrime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        primeCheck(n);
        sc.close();
    }
}
