package Array;

public class ArrayFunctionArgument {
    public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
       marks[i]=marks[i]+i;
      
    }
    

    }
    public static void main(String[] args) {
        
       int  marks[] ={12,65,62};
        update(marks);
        //to print  updated array
        for(int i=0;i<marks.length;i++)
        {
             System.out.println(marks[i]+ " ");
        }
    }
}
