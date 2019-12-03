package day06;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the regular price of the item");
        double regularPrice=scan.nextDouble();
        System.out.println("Enter the discount percentage of the item");
        double discounPercentage=scan.nextDouble();

        double salePrice=regularPrice-(regularPrice*discounPercentage/100);
        System.out.println("Regular price is "+regularPrice+" discount percentage is "+discounPercentage+" and your deal is "+salePrice);
    }
}
