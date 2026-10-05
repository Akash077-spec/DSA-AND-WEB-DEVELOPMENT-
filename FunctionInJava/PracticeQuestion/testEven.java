package FunctionInJava.PracticeQuestion;

import java.util.Scanner;

public class testEven {
    /*
     * Write a method named isEven that accepts an int argument. The method
     * should return true if the argument is even, or false otherwise. Also write a
     * program to test your
     * method
     */
    public static boolean isEven(int number) {
        if(number%2==0){
            return  true;
        }else{
           return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = sc.nextInt();
        if(isEven(number)){
            System.out.println("Even number");
        }else{
            System.out.println("Not a even number");
        }
        sc.close();
    }
}
