package FunctionInJava;

public class callByValue {
    public static void change(int num1) {//a value  20 will be copied and num will become 10 but when it redirect to main function it will use original value of a
        num1 = 10;

    }

    public static void main(String args[]) {
        int a = 20;
        change(a);
        System.out.println(a);//original value of a 20 will print

    }
}
