package Array;

public class linearSearch {
    public static int linearSech(int number[],int key){
        for(int i =0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }return -1;

    }
    public static void main(String[] args) {
        int number[]={1,23,47,89,78,45,32,55};
        int key =5;
        int index=linearSech(number,key);
        if(index== -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is found at:" + index);
        }
    }
}
