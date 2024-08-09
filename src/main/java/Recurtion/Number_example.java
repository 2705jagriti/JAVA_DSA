package Recurtion;

public class Number_example {
    public static void main(String[] args) {
print_number(1);
    }
    // all the function have different name and parameter
    static void print_number(int n ){
        System.out.println(n);
        print_number2(2);
    }
    static void print_number2(int n ){
        System.out.println(n);
        print_number3(3);
    } static void print_number3(int n ){
        System.out.println(n);
        print_number4(4);
    }
    static void print_number4(int n ){
        System.out.println(n);
        print_number5(5);
    }
    static void print_number5(int n ){
        System.out.println(n);
    }

}
