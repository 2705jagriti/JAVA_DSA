package DSA_prepration;

import java.util.Arrays;
import java.util.Scanner;

public class two_D_array {
    public static void main(String[] args) {
        //int[][] arr = new int[4][5];
        // number of column can vary and not ness.. to declare
//        int[][] array={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
////        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//
//        }




        //System.out.println("Enter the row and column");
        Scanner in = new Scanner(System.in);
        int[][] array2= new int[2][2];
        System.out.println("Enter the element ");
        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0; j <array2[i].length ; j++) {
                array2[i][j]=in.nextInt();

            }
        }
        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0; j <array2[i].length ; j++) {
                System.out.print(array2[i][j] + " ");
            }

        }
        System.out.println();



    }
}
