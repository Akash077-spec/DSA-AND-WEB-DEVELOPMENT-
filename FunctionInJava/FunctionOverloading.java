package FunctionInJava;

public class FunctionOverloading {
    public static int add(int a,int b){/*function overloading is used 
        1. we use add method three time . but parameter are different for all methods
        2. method overloading depent on parameter and number of parameter
        
        */ 

        int sum=a+b;
        return sum;
    }
    public static int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static double add(double a, double b){
        double sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        int a=10;
        int b=12;
        int c=20;
        System.out.println("Addition is :" + add(a,b));
        System.out.println("Addition is :" + add(a,b,c));  
        System.out.println("Addition is :" + add(12.03,25.03));      
    }
}
