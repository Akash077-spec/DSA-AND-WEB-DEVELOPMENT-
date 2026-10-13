package PracticeMixed1;
import java.util.Scanner;
public class NumberAnalysis {
    public static void analyzeNumber(int n){
        int sum=0;
        int count=1;
        int i =1;
        while(n>=i){
            sum=sum+i;
            i++;
        } System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        analyzeNumber(n);
    }
}
