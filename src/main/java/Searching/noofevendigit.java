package Searching;
// to find
public class noofevendigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
       // System.out.println(findnumber(nums));
        System.out.println(digit2(612981));
    }
   static  int findnumber(int[] nums){
        int count=0;
       for (int num:nums) {
           if(even(num))count++;
       }
return count;
    }
    //function to check if contain even number of digit or not
    static  boolean even(int num) {
        int numberOfDigit = digit(num);
       /*
        if(numberOfDigit % 2 ==0){
            return true;*/
       return numberOfDigit % 2 ==0;// true return true
    }
    static int  digit(int num){
        int count =0;
        if(num==0){
            return 1;
        }
        if(num<0){
            num= num*-1;
        }
        //  while(num > Integer.MIN_VALUE) its not working
        while(num >0){
            count++;
            num=num/10;

        }
        return count;
    }
    static int digit2(int num){
        return  (int)(Math.log10(num)+1);
    }
}
