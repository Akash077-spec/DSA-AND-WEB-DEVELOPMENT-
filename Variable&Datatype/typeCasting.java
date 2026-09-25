public class typeCasting {
    public static void main(String args[]){
        float f = 10.5f;
        // int a = f;// type mismatch. cant be converted to float so use type casting
        int a =(int)f;//typecasting
        System.out.println(a);
        // typecasting in charcter
        char ch='A';
        char ch1 = 'a';
        int number = ch;
        int number1 = ch1;
        System.out.println(number);
        System.out.println(number1);
    }
}
