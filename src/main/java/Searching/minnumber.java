package Searching;

public class minnumber {
    public static void main(String[] args) {
        System.out.println(minsearch(new int[]{2,5,8,6,1,6,4,0}));
    }
    static int  minsearch (int[] arr ){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for (int j = 0; j <=arr.length ; j++) {
            if (arr[j] < min){
                min= arr[j];
            }
        }
        return min ;



    }
}
