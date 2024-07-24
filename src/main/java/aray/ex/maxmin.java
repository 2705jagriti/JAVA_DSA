package aray.ex;

import java.util.Scanner;

public class maxmin {
    // find the smallest largest and second largest
    public static void main(String[] args) {
//        print number of element in array
//        int[] arr ={1,3,5,7,3,8,4};
//        System.out.println(arr.length);
        System.out.println("Enter number of element in an array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter element of array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();}
        int max=arr[0];
        int max2=arr[1];
        int smaller = arr[3];
        if(max2>max){
            int temp =max;
            max=max2;
            max2=temp ;
        }
        if(smaller>max2){
            int temp = smaller;
            smaller = max2;
            max2 = smaller;
        }
        for ( int i = 2; i < n  ; i++) {

         if (arr[i]>max) {
            max2 = max;
            max= arr[i];
        }
        else if (arr[i]>max2 && arr[i]!=max ) {
                max2 = arr[i];
        } else if (arr[i]<max2 &&  arr[i]<smaller){
            smaller=arr[i];

         }
        }
        System.out.println("smallest " + smaller);
        System.out.println("first max value is " + max);
        System.out.println("second max value is " + max2);
        }

    }

