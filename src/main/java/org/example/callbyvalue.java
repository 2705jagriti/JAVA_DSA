package org.example;

import java.util.Scanner;

public class callbyvalue {
    public static void main(String[] args) {
        int ans =sum3(20,30);
        System.out.println(ans);
    }

    public static int sum3(int a ,int b) {
        int sum = a + b ;
        return sum;


    }
//pass the value of number at calling time
//return the value
public static int sum (int a, int b){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter num 1");
    int num1 = in.nextInt();
    System.out.println("Enter num 1");
    int num2 = in.nextInt();
    int sum = num1 + num2;
    return sum;
}}