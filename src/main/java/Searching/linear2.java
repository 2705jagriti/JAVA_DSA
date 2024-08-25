package Searching;

public class linear2 {
    public static void main(String[] args) {
        Boolean ans = linear(new int[]{2,4,3,556,3,53,3,3,5,2,4}, 4);
        System.out.println(ans);
    }
    // search in array
    static boolean linear(int[] arr , int target ) {
        if (arr.length == 0) {
            return false;
        } else {
            for (int input = 0; input < arr.length; input++) {
                if (arr[input] == target) {
                    return true;
                }

            }
        }
        // we use boolean bcz we can have -1 as an array element
        //did ir with boolean
// alwayes executes before the end of constructor
return false;
    }
}
