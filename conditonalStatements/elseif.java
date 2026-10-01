package conditonalStatements;
import java.util.Scanner;
public class elseif {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        float age= sc.nextFloat();
        if(age>=18){
            System.out.println("you are adult");

        }else if(age>=13 && age<18){
            System.out.println("you are teenager");
        }else{
            System.out.println("youe are child ");
        }sc.close();
    
    }
}
