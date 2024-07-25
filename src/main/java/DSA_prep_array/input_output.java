package DSA_prep_array;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        //input in 2d array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("enter element of array" );
        int[][] array_2d = new int[n][m];
        for (int input = 0; input <n ; input++) {
            for (int j = 0; j < m; j++) {
                array_2d[input][j]= in.nextInt();

            }

        }
        //XXXXX OUTPUT XXXXXXXXX
        for (int i = 0; i <array_2d.length; i++) {
            for (int j = 0; j <array_2d[i].length; j++) {
                System.out.print(array_2d[i][j] + " ");

            }
            System.out.println();
        }

// LEARN DIFFERENT TYPE OF PRINT

    }
}
