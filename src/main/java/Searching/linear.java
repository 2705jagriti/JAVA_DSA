package Searching;

public class linear {
    public static void main(String[] args) {
        int ans = linear(new int[]{2, 3, 4, 5, 6, 7, 8 ,10},100);
        System.out.println(ans);
    }
    static int linear(int[] arr , int item ){
       if(arr.length==0){
        return -1;
    }
        for (int input = 0; input <arr.length ; input++) {
           if(arr[input] == item ){
               return input;
           }
        }
        return -1;
}
}