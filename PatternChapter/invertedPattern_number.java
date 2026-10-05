package PatternChapter;

public class invertedPattern_number {
    public static void invertedRotated_HalfPryamid_number(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col);
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRotated_HalfPryamid_number(5);
    }
}
