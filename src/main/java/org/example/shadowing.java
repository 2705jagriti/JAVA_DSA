package org.example;

public class shadowing {
    static int x =90;// hum static lga ke constructor se phle variable declare kr sakty hai
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
