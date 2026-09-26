package operators;

public class logicalOperator {
    public static void main(String[] args) {
        int a=23;
        int b=55;
        int c=100;
        System.out.println((a>b)&&(b<c));// logical and &&
        System.out.println((a<b)&&(b<c));// logical and &&
         System.out.println((a>b)||(b<c));// logical or ||
         System.out.println(!(a>b)); // logical not !
    }
}
