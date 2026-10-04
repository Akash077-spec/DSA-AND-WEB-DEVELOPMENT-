package FunctionInJava;
import java.util.Scanner;
public class DecimalToBinary {
    public static void DecToBin(int deciNum){
int pow=0;
int bin=0;
int decimal=deciNum;
while(deciNum>0){
    int remainder = deciNum%2;
     bin = bin+remainder*(int)(Math.pow(10,pow));
     deciNum=deciNum/2;
     pow ++;
}System.out.println("Decimal number " + decimal + " binary is " + bin);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number :");
        int deciNum = sc.nextInt();
         DecToBin(deciNum);

        sc.close();

    }
}
