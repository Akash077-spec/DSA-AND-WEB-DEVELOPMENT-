package FunctionInJava;

public class method01 {
    public static void greet(){//creating a greet() function which have void type
        System.out.println("Hello Akash");
        System.out.println("How are you");
    }
    public static void main(String[] args) {
        System.out.println("Hii");
        greet();//function call
        System.out.println("I am fine");
        greet();//calling function second time
    }
}
