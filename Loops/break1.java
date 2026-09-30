package Loops;

public class break1 {
    public static void main(String[] args) {
        int i =1;
        while(i<=10){
            if(i==7){
                break;
            }
            System.out.println(i);
            i++;
        }System.out.println("Exit the loop");
    }
}
