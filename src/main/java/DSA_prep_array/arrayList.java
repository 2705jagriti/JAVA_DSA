package DSA_prep_array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
//        }
            //add element
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    list.get(k).add(in.nextInt());

                }
            }

//        list.add(35);
//        list.add(8745);
//        list.add(23);
//        list.add(232);
//        list.add(889);
//        list.add(67);
//        System.out.println(list);
//        list.set(2,67237);
//        System.out.println(list);
//        System.out.println(list.get(3));

        }
    }
}