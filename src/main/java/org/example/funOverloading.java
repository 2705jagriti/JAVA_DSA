package org.example;

public class funOverloading {
    public static void main(String[] args) {
        // same function but diff args
         fun(3);
         fun(2,4);

    }

    public static void fun( int a ,int b ) {
        int c ;
        System.out.println( c=a*b);


    }

    public static void fun(int x) {
        int y ;
        System.out.println(y=x+10);

    }
}
