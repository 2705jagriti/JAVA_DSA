package Revision;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( shorted( new int[] {1,2,3,4,5,5}));

    }
    static boolean shorted (int[] arr){
            for (int i = 0; i < arr.length ; i++) {
                int a=arr[0];
                int b = arr[1];
                if(a<b){
                    return true ;
                }
            }
            return false;
    }
}
