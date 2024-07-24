package aray.ex;

public class findRedendent {
    public static void main(String[] args) {
        int[] arr = {14,13,12,11,19,17,13,12,18};
        int redendent = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] == (arr[j])) && (i != j)){
               redendent= redendent+1;
            }
            }
        }
        System.out.println(redendent);
    }
}
