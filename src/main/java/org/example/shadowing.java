package org.example;

public class shadowing {
    static int x =90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        int x = 50 ;
        System.out.println(x);

    }
}
