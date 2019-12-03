package day12;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather =scan.nextLine();
        if(weather.equals("Sunny")){
            System.out.println("Code in "+weather+" weather");
        }
        else if(weather.equals("Rainy")){
            System.out.println("Code in "+weather+" weather");
        }
        else if(weather.equals("Cloudy")){
            System.out.println("Code in "+weather+" weather");
        }
        else if(weather.equals("Snowy")){
            System.out.println("Code in "+weather+" weather");
        }
        else {System.out.println("Rain or shine just keep coding anyway!!!");
        }
    }
}
