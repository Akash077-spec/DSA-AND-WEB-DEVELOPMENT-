package nestedLoop;

public class halgPyramid {
    public static void main(String[] args) {
        // half pyramid
        for(int row=1;row<=4;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }System.out.println();
        }
    }
}
