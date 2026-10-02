package nestedLoop;

public class characterPattern {
    public static void main(String args[]){
        for(char row='A';row<='D';row++){
            for(char col='A';col<=row;col++){
                System.out.print(col);
            }System.out.println();
        }
    }
}
