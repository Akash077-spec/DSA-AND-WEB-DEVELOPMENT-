public class typeCasting {
    public static void main(String args[]){
        float f = 10.5f;
        // int a = f;// type mismatch. cant be converted to float so use type casting
        int a =(int)f;//typecasting
        System.out.println(a);
    }
}
