package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class colnotfixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] colf ={
                {1,4,2,4},
                {3,5,2,5,6,73,7}
                ,{5,7,2,8,4,2}
        };
        for (int row =0 ; row < colf.length ; row++){
            for (int col = 0; col< colf[row].length ; col++){
                System.out.println(colf[row][col] + " ");
            }
        }
        System.out.println();

}}
