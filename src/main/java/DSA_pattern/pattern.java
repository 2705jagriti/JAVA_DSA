package DSA_pattern;

public class pattern {
    public static void main(String[] args) {
        // pattern1(4);
          //pattern2(5);
       // pattern3(5);
        pattern4(4);
    }
    static  void pattern1(int n ){
        for (int row = 1; row <=n ; row++) {
            // for every row run the col
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
            // when row is printed we need to add a new line
        }
    }
    static void pattern2(int num){
        for (int row = 1; row <=num ; row++) {
            // for every row run the col
            for (int col = 1; col <=num ; col++) {
                System.out.print("* ");
            }
            System.out.println();
            // when row is printed we need to add a new line
        }}
    static void pattern3( int a){
        for (int row = 0; row <=a ; row++) {
            for (int col = 0; col <a-row+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static  void pattern4(int b){
        for (int row = 0; row <= 2*b   ; row++) {
            int c = row >b ? 2*b-row :row;
            for (int col = 0; col <= c; col++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
