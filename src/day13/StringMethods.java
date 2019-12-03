package day13;

public class StringMethods {
    public static void main(String[] args) {
        // String actions that we have so far

        // equal
        String s1 = "ibrahim";
        System.out.println(s1.equals("abc"));

        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("Ibrahim"));

        //toUpperCase method of String is used to make String all Character uppercase
        System.out.println (  s1.toUpperCase()   );

        //toLowerCase method of String is used make String all character lowercase
        System.out.println( s1.toLowerCase() );
        System.out.println( s1.length() );
        System.out.println( s1.hashCode());


    }
}
