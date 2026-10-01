package Loops.questionPractice;

import java.util.Scanner;

public class multiplicationTable {
    //multiplication table
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Multiplication table =====");
        System.out.print("Enter number : ");
        int multiplication = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplication + "*" + i + "=" + multiplication * i);
            
        }

    }
}
