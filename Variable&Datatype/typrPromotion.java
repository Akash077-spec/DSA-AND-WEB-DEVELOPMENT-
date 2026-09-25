public class typrPromotion {
    public static void main(String args[]){
        short s = 12;
        byte b = 7;
        char ch= 'a';
        byte bt= (byte)(s+b+ch);
        System.out.println(bt);
        char ch1= 'a';
        char ch2='b';
        int result=ch1+ch2;
        System.out.println((int)ch1);
        System.out.println((int)ch2);
        System.out.println(result);
        int aa=122;//type promotion
        float bb =3.33f;
        float result1 =aa+bb;
        System.out.println(result1);
    }
}
