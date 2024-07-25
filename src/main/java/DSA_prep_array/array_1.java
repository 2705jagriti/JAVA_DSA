package DSA_prep_array;

import java.util.Arrays;

public class array_1 {
    public static void main(String[] args) {
// METHOD OR ARRAY DECLARATION
// DECLARATION int[] array_name ; + INITIALIZATION array_name = new int[array_length]
int[] array = new int[4];
        //System.out.println( array.length);
// how to add element array_name[index]= value;
 array[0]= 10;//cant give string to int array
        // integer.parseInt("string need to parse")
        //System.out.println(array[0]);

 // METHOD 2 TO int[] array_name = {element ,,}
// int[] arr2 ={1,2,3,4,5,6};
       // System.out.println(Arrays.toString(arr2));

        int[] arr2 ={1,2,3,4,5,6};
        for (int i = 0; i <arr2.length ; i++) {
            //System.out.println(arr2[i] );

        }

        int[] arr3 = new int[4];
        arr3[0]=10;
        arr3[1]=20;
        arr3[2]=30;
        arr3[3]=40;
        for (int item = 0; item <arr3.length ; item++) {
            //System.out.println(arr3[item]);
        }

     // AARAY WITH INPUT

        //Scanner in = new Scanner(System.in);
//       // CONVERT ARRAY TO STRING

 //          int n = in.nextInt();
//           int[] arr4 = new int[n];
//           for (int i = 0; i <n ; i++) {
//                  arr4[i] = in.nextInt();
//
//
//                  //System.out.println("Enter the length of the array");
//        }
//             //System.out.println(Arrays.toString(arr4));

int [] arr5 ={1,2,3,4,5};
           for (int i = 0; i <arr5.length ; i++) {
                  System.out.println(arr5[i]);
           }
           System.out.println( Arrays.toString(arr5));






    }
}
