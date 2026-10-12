package PatternChapter;

public class HollowRectangle {

    public static void hollowPattern(int TotalRow,int TotalCol){
        for(int row=1;row<=TotalRow;row++){
            for(int col=1;col<=TotalCol;col++){
                if(row==1|| col==1 || row==TotalRow ||col==TotalCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowPattern(10,20);// function call
        
    }
}
