package org.example;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch(day){
            case 1:
                System.out.println("working day ");
            case 2:
                System.out.println("work day " );
            default:
                System.out.println("weekend");
        }
    }
}
