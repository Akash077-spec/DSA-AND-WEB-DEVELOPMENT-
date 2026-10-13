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
        System.out.println("Phy mark is : " + marks[1]);
        System.out.println("Math mark is : " + marks[2]);
        System.out.println("chem mark is : " + marks[3]);
        System.out.println(" bio mark is : " + marks[4]);
        sc.close();
    }
}
