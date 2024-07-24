package aray.ex;

import java.util.Arrays;
import java.util.Scanner;

//test if an array contain a  specific value
public class searchvalue {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArr = new int[n];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i]= in.nextInt();

        }
        System.out.println(Arrays.toString(myArr));
//        System.out.println("Enter number need to search");
//        int m = in.nextInt();
//        int m1 = m;
        System.out.println(conatin(myArr ,2021));
//        int [] myArr = {1763 ,5270, 7827, 2018,3019};





    }
static boolean conatin(int[] arr , int  item ){
              for (int j : arr) {
                  if (j == item) {
                      return true;
                  }
              }
    return false;
}}





