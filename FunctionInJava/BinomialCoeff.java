package FunctionInJava;
import java.util.Scanner;
public class BinomialCoeff {
    public static int Factorial(int n){
        int f=1;
        for(int i =1;i<=n;i++){
            f=f*i;
        }return f;
    }
    public static int BinoCoeff(int n,int r){
        int fact_N= Factorial( n);
        int fact_R= Factorial( r);
        int fact_NMR= Factorial( n-r);
        int NCR =fact_N/( fact_R*fact_NMR);
        return NCR;




    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n value :");
    int n =sc.nextInt();
     System.out.print("Enter r value :");
    int r =sc.nextInt();
    int result=Factorial(n);
    int binomialCoeff= BinoCoeff(n,r);
    System.out.println("Factorial is : "+result);
    System.out.println("Binomial Coefficient : "+binomialCoeff);
    sc.close();

    }
}
