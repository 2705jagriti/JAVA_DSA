package DSA_prep_String;

import java.util.Scanner;

public class pallendrom {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter respective String ");
        String data = in.next();
        input.append(data);
        input.reverse();
        if (data == (String.valueOf(input.reverse()))) {
            System.out.println(" Input is pallendrome");
        }
        else {
            System.out.println("not a pallendrome");
        }
    }
}
