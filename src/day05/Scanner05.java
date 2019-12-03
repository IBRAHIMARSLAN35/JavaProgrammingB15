package day05;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Hello what is your name ?");
        String name=scanner.next();
        System.out.println("Your name is "+name);

        System.out.println("How old are you?");
        int age=scanner.nextInt();
        System.out.println("You are "+age+" years old.");

        System.out.println("How tall are you? (feet and inch)");
        int height1=scanner.nextInt();
        int height2=scanner.nextInt();
        System.out.println("You are "+height1+ " feet and "+height2+" inches tall.");
    }
}
