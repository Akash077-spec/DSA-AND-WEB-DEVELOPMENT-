package Array;
import java.util.Scanner;
public class inputArray {
    public static void main (String args[]){
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter marks");
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        System.out.println("Math mark is : " + marks[2]);
        System.out.println("chem mark is : " + marks[3]);
        System.out.println("bio mark is : " + marks[4]);
        System.out.println("Array length is :"+ marks.length);
        float percentage = (marks[1]+marks[2]+marks[3]+marks[4])/4;
        System.out.println("Percentage is :" + percentage);
        System.out.println("Phy mark is : " + marks[1]);

       /*
       Revision and practice the concept of taking the input from the user in a array data structure.
       
        */
        String cars[]=new String[10];
        System.out.println("Enter your car choices ");
         cars[0]=sc.next();
         cars[1]=sc.next();
         cars[2]=sc.next();
         cars[3]=sc.next();
         System.out.println("First car choice is: "+cars[0]);
         System.out.println("Second car choice is: "+cars[1]);
        System.out.println("Third car choice is: "+cars[2]);
         System.out.println("Fourth car choice is: "+cars[3]);
        

        
        sc.close();
    }
}
