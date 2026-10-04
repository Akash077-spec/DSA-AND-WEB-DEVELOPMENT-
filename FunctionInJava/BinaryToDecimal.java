package FunctionInJava;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void BinToDecimal(int BinaryNumber){
    int pow=0;
    int dec=0;
     int originalBinaryNumber = BinaryNumber;
    while(BinaryNumber>0){
       
        int lastDigit = BinaryNumber%10;
        dec = dec + lastDigit*(int)(Math.pow(2,pow));
        BinaryNumber = BinaryNumber/10;
        pow++;
    }System.out.println("Binary number " + originalBinaryNumber + " to decimal is : " + dec);

    }
 
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int BinaryNumber=sc.nextInt();
        BinToDecimal(BinaryNumber);



        sc.close();
    }
}
