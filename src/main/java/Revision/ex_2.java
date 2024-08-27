package Revision;

import javax.swing.*;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( shorted( new int[] {1,2,6,4,5,5}));

    }
    static int  shorted (int[] arr){
        int temp;
            for (int i = 0; i < arr.length ; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                   if(arr[i]<arr[j]){
                       temp = arr[i];
                       arr[i]= arr[j];
                       arr[j]=temp;
                   }

                }
                int ans;
                System.out.println(arr[i]);
            }

return ans ;
    }
}
