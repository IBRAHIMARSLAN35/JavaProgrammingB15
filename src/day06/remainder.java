package day06;

import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the minute that you would like to convert");
        int minute=scan.nextInt();

        int remaininMinute=(minute%60);
        int hour=minute/60;


        System.out.println(minute +" minutes is equals to "+hour+" hours "+remaininMinute+" minutes");


    }
}
