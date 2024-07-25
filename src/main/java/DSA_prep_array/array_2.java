package DSA_prep_array;

import java.util.Arrays;
import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        // ARRAY OF OBJECTS NON PRIMITIVE
        Scanner in = new Scanner(System.in);
        //String[] arr = new String[5];
        //System.out.println("Enter names");
        //for (int i = 0; i < arr.length; i++) {
          //  arr[i] = in.next();
        //}
        //System.out.println(Arrays.toString(arr));
        //arr[0] = "jagriti";
        //System.out.println(Arrays.toString(arr));
// PASSING VALUE THROUGH FUNCTION
        int[] number = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(number));
        remove_element(number);
        System.out.println(Arrays.toString(number));

    }

    static void remove_element(int[] arr) {
        arr[0] = 99;
    }

}

