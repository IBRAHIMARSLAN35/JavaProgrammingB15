package day11;

public class StringEquality {
    public static void main(String[] args) {
        String name="Rabia";
        String name2=new String("Rabia");
        String name3="Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name==name2);
        System.out.println(name==name3);
    }
}
