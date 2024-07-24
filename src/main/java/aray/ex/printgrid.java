package aray.ex;

import java.util.Scanner;

public class printgrid {
    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d " , arr[i][j]);
             }
            System.out.println();
        }}}

//        int[][] a = new int[10][10];
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.printf("%2d ", a[i][j]);
//            }
//            System.out.println();
//        }
//    }




