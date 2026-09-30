package conditonalStatements.practiceQuestion;
import java.util.Scanner;
public class question1 {
    public static void main(String args []){
        // to check whether number is a positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number : ");
        int number= sc.nextInt();
        if(number>=0){
            System.out.println(" Positive number");
        }else{
            System.out.println(" Negative number");
        }sc.close();
    }
    
}
