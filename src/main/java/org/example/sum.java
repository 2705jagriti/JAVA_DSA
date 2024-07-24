package org.example;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       greeting();
        sums();
        int ans = sum2();
        System.out.println(ans);
    }
        public static  void sums(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter num 1");
            int num1 =in.nextInt();
            System.out.println("Enter num 1");
            int num2 =in.nextInt();
            int sum= num1 + num2;
            System.out.println("Enter number sun is " + sum);

        }

    public static void  greeting() {
        System.out.println("hello User");

    }

    public static int sum2 (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 =in.nextInt();
        System.out.println("Enter num 1");
        int num2 =in.nextInt();
        int sum= num1 + num2;
        return sum;

    }





        /*
          access modifier return_type name (argument ){
          //body
           }

         */
    }

