package Revision;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        double radius = in.nextInt(); //changed  int to double
//        //int r = radius*radius;
//        double area = Math.PI * radius *radius;
//        //int area = (int) (3.14 * r);
//        System.out.println(area);
//        // WITH USE OF DOUBLE WE CAN PRINT DECIMAL




        // area of isosceles triangle 1/2 *b*h
        System.out.println("Enter Base and height ");
        int base = in.nextInt();
        double height = in.nextInt();
        double area = 0.5 *base*height;
        System.out.println("Area : " + area);




    }
}
