package org.example;

import java.util.Scanner;

public class ex2 {


    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalize = myGreet( name);
        System.out.println(personalize);
        String a=greet();
        System.out.println(a);

    }

    static  String myGreet(String name ) {
        String greeting = "Hello" +" " + name ;
        return greeting;

    }





    public static String greet(){
        String greeting = "How are you";
        return greeting;



    }














}
