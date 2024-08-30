package Revision;

public class mininarray {
    public static void main(String[] args) {
        System.out.println(min(new int[]{1,6,4,7,5,-8,3,4,5-9,0}));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]< ans ){
               ans = arr[i];
            }
        }
        return ans;
    }

}
