package DSA_prep_String;

public class pallendrome_2 {
    public static void main(String[] args) {
String  str = "aabcaa";
        System.out.println(ispallendrome(str));
    }
    static boolean ispallendrome(String str ) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
return true;
    }
}
