package aray.ex;

import java.util.Scanner;

public class secondlarget {
    public static void main(String[] args) {
        System.out.println("Enter th size of an array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int max2 =  arr[1];
        int smallest =arr[2];
        if (max2>max){
            int temp = max;
            max = max2;
            max2= temp;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] > max ){
                max = arr[i];
            } else if (arr[i]>max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        System.out.println("smallest value is " + smallest);
        System.out.println("second largest value is " + max2);
    }
}
