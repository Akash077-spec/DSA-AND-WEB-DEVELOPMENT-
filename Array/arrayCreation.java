package Array;

public class arrayCreation {
    public static void main(String[] args) {
        // There are two way of creating array
        // 1 way
        int numbers[]=new int[10];
        numbers[1]=90;
        numbers[2]=10;
        numbers[3]=18;
        numbers[4]=20;
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        // 2 way
        String  fruits[]={"apple","banana"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

    }
}
