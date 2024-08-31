package Searching;

public class maxwealth {
    public static void main(String[] args) {
        int[][] accounts ={
                {1,3,2},
                {6,4,7},
                {3,5,7}
        };
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // going to every column of every row
            int rowsum=0;
            for (int anInt : ints) {
                rowsum+=anInt;
            }
            if(rowsum > max){
                max =rowsum;
            }

        }
        return max;
    }
}
