package Searching;

public class seach_in_range {
    public static void main(String[] args) {
searchinrangr(int[] new{1,2,3,4,4}
    }
    static  int searchinrangr(int[] arr , int target ,int start ,int end ){
        if(arr.length==0){
            return -1;
        }

        for (int index = start; index <=end; index++) {
          int element = arr[index];
            if(element==target){
                return index;
            }

        }
        // this line will execute if non of the retune is possible
        // target not found


        return -1;
    }
}
