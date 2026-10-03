package FunctionInJava;

public class Product {
    public static int product1(int a , int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String args[]){
        int a =10;
        int b=20;
        int result =product1(a,b);
        System.out.println("product is :" + result);


    }
}
