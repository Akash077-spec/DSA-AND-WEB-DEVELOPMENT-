package operators.practiceQuestion;
import java.util.Scanner;
public class electricityCal {

    public static void main(String[] args) {
        System.out.println("===== ELECTRICITY BILL CALCULATOR =====");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit :");
        int unit = sc.nextInt();

        if (unit >= 0 && unit <= 100) {

            System.out.println("Total unit cost is :" + (2 * unit));
        } else if (unit >= 101 && unit <= 200) {

            System.out.println("Total unit cost is :" + (3 * unit));
        } else if (unit >= 201 && unit <= 300) {

            System.out.println("Total unit cost is :" + (5 * unit));
        } else {
            System.out.println("Total unit cost is :" + (7 * unit));
        }System.out.println("===== THANK YOU =====");
        sc.close();

    }
}
