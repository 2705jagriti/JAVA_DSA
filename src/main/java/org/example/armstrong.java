package org.example;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num= in.nextInt();

        for( int i=0;i<100;i++){
//       if(isarmstrong(num)){
           System.out.println( i +" ");
       }
    }

    static void isarmstrong(int num ) {
        int original = num;
        int sum=0;
        while(num>0){
            int rem= num %  10;
            num = num / 10;
            sum =  sum + rem*rem*rem;
        }
        if (sum==original){
            System.out.println("Entered number is armstrong");
        }else {
            System.out.println("Entered number is not armstrong");
        }
    }
    }



