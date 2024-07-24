package aray.ex;

import java.util.Arrays;
import java.util.Scanner;

public class removeelement {
    public static void main(String[] args) {
       int[] arr ={26,73,66,73,37 };
       int index = 2;
       int value = 42;
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i > index ; i--) {
            arr[i] = arr[arr.length-1];

    }
        arr[2]=value;
        System.out.println("new array" + Arrays.toString(arr));



}}


