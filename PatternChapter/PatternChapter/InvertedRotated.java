package PatternChapter;

public class InvertedRotated {
    //inverted rotated half pyramid pattern
    public static void invertedRotated_HalfPryamid(int n){
        for(int row=1;row<=n;row++){
            for(int space =1;space<=n-row;space++){
                System.out.print(" ");
            }for(int col=1;col<=row;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRotated_HalfPryamid(4);
    }
}
