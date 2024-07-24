package aray.ex;

import java.util.Scanner;
// find index of an array element
public class findIndex {
    public static void main(String[] args) {
        System.out.println("Enter the number of element");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("sum of array is " + sum);
    }
}
