package FunctionInJava;

public class swap {
    // use temporary variable to swap the values of a and b
    public static void main (String args[]){
        int a=10;
        int b=20;
        int temp = a;
        a=b;
        b=temp;
        System.out.println("value of a is :" + a);
        System.out.println("value of b is :"+b);
    }
}
