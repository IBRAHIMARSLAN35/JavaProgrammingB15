package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        int count=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("KNOCK KNOCK");
        System.out.println("WHAT IS THE PASSWORD");
        String password=scan.next();
        while(!password.equals("B15") && count<3){
            System.out.println("WRONG PASSWORD ENTER AGAIN");
            password=scan.next();
            count++;
            if(count==3){
                System.out.println("You attempt too many times.Door locked 1 hour.");
            }
        }
        System.out.println("OPEN SESAME");
    }
}
