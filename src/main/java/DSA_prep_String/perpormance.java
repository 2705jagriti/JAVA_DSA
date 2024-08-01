package DSA_prep_String;

public class perpormance {
    public static void main(String[] args) {
        String series = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);

//            builder.repeat(2,2);


        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
    }
}










//        for (int i = 0; i <26 ; i++) {
//            char ch = (char)('a' + i);
//            System.out.println(ch);
//    series=series+ch;
//            System.out.println(series);
//    this will take to many memory space , so we use stringbuilder



