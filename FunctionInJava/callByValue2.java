package FunctionInJava;

public class callByValue2 {
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;// use return to get the change value
    }
    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        sum(a, b);

        System.out.println("sum is:" + sum(a, b));
    }
}