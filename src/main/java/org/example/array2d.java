package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
       int[][] str= {
               {1, 2, 3},
               {5, 12, 3,},
               {2, 2, 4, 32, 12,}
       };
//        System.out.println(str.length);//number of row
//        System.out.println(Arrays.toString(str[1]));
//input
       Scanner in = new Scanner(System.in);
       int[][] str2 = new int[3][3];
        for (int row =0; row < str2.length; row++ ){
         //for each col
          for(int col =0 ; col < str2[row].length;col++){
               str2[row][col]= in.nextInt();
         }
       }
//        for (int row =0; row < str2.length; row++ ){
//            //for each col
//            for(int col =0 ; col < str2[row].length;col++){
//                System.out.println(str2[row][col]  + " ");
//
//            }
//            System.out.println();
//        for (int row =0; row < str2.length; row++ ){
//            System.out.println(Arrays.toString(str2[row]));
        for(int[] a: str2){//enhanced form
            System.out.println(Arrays.toString(a));
        }
    }

}
