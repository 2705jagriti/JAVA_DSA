package Searching;

import java.util.Arrays;

public class seachfor2d {
    public static void main(String[] args) {
        int[][] arr={
                {23,70,84,65},
                {24,75,84,},
                {64,76,90,64},
                {74,75}
        };
        int target =74;
        int[] ans = search(arr,target);//format to return value {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static  int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[col].length ; col++) {
                if(arr[row][col] == target){
                   return  new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static  int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max ;
    }

}


