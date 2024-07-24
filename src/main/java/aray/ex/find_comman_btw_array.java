package aray.ex;

public class find_comman_btw_array {
    public static void main(String[] args) {
        System.out.println("Enter an array");
        pair_value( new int[]{1,4,6,3,8,5,9,7},10);

    }
        static void pair_value(int arr[] , int num){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
if(arr[i] + arr[j] == num && i!=j) {
    System.out.println(arr[i] + "+" + arr[j] + "=" + num);
               }
            }
        }
    }
}

