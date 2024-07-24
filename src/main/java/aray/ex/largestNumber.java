package aray.ex;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        System.out.println("Enter number of element in an array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter element of array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();

        }//to find the max value
         int max=arr[0];
    for (int i = 0; i < n  ; i++) {
            if(max<arr[i]){
                max=arr[i];

            }
        }
        System.out.println("The largest number is " + max);
    }
}
