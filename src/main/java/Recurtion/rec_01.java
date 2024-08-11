package Recurtion;

public class rec_01 {
    public static void main(String[] args) {
        print_number(1);
    }
    // all the function have different name and parameter
    static void print_number(int n ){
        if (n==5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        print_number(n+1);
    }
     // if you call a fun again  ,and again you can treat that as a separate call in stack

//
//
//    static void print_number2(int n ){
//        System.out.println(n);
//        print_number3(3);
//    } static void print_number3(int n ){
//        System.out.println(n);
//        print_number4(4);
//    }
//    static void print_number4(int n ){
//        System.out.println(n);
//        print_number5(5);
//    }
    //here the function  body changes
//    static void print_number5(int n ){
//        System.out.println(n);
//    }

}

