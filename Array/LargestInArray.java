package Array;
/*
LOGIC:
Largest  -> Start with Integer.MIN_VALUE
         -> Traverse array
         -> If number[i] > largest, update largest

Smallest -> Start with Integer.MAX_VALUE
         -> Traverse array
         -> If number[i] < smallest, update smallest

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class LargestInArray {
    public static int getLargest( int number[]){
       int largest= Integer.MIN_VALUE;
       for(int i=0;i<number.length;i++){
        if(number[i]>largest){
            largest=number[i];
        }
       }
       return largest;

    }
    public static int getSmallest( int number[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
            }
        }return smallest;
    }
    public static void main(String[] args) {
        // find the largest number in a given array\
        int number[]={1,43,9,56,45};
        System.out.println("Largest number is : "+ getLargest(number));
         System.out.println("Smallest  number is : "+ getSmallest(number));
    }
}
