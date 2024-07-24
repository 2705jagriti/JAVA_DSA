package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class array  {
    public static void main(String[] args) {
//       int[] arr= new int[6];
//        System.out.println(arr[2]);
//      String[] name = new String[5];
//        name[0]="jagriti";
//       name[3]="raj";
//        System.out.println(name[0]);
//        String[] surname={"chaudhary","gupta"};
//        System.out.println(surname[0]);
//        array of object
        Scanner in = new Scanner(System.in);
        String[] arr = new String[3];
        for(int i=0; i<arr.length; i++){
            arr[i]=in.next();
        }
        System.out.println(Arrays.toString(arr));
        arr[1]="amit";
        System.out.println(Arrays.toString(arr));

    }

}
