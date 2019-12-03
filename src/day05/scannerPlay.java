package day05;

import java.util.Scanner;

public class scannerPlay {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println(" Hello tell us about yourself.\n What is your name and surname ? \n" +
                    " How old are you ? \n How tall are you? (feet and inch) \n And where do you live ?");


            String name=scanner.next();
            String surname=scanner.next();
            int age=scanner.nextInt();
            int height1=scanner.nextInt();
            int height2=scanner.nextInt();
            String city=scanner.next();
            System.out.println(" Your name is "+name+" "+surname+".\n You are "+age+" years old.\n"+
                    " And you are "+height1+ " feet and "+height2+ "" +
                    " inches tall which is pretty high.\n" +
                    "" +"" +
                    " And also you live in "+city+".");

        }
    }


