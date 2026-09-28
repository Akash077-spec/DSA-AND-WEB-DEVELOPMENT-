package conditonalStatements;
import java.util.Scanner;
public class taxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income : ");
        int income = sc.nextInt();
        
        int tax;
        if(income<=50000){
            tax=0;
        }else if(income>50000 && income<=10000){
            tax = (int)(income * 0.20);

        }else{
            tax=(int)(income*0.30);
        }
        System.out.print("Your tax is :" + tax);
        sc.close();
    }
}
