package day15;

public class ReversingAString {
    public static void main(String[] args) {
        String name="Ibrahim";
        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+name.charAt(2)+" "+name.charAt(3)+" "+name.charAt(4)+" "+name.charAt(5)+" "+name.charAt(6));
        System.out.println(name.charAt(6)+" "+name.charAt(5)+" "+name.charAt(4)+" "+name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.lastIndexOf(name.charAt(name.length()-1)));
    }
}
