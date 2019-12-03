package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible to vote!");
        } else {
            System.out.println("wait until you are 18 years old.");
        }
        int favoriteNumber = scan.nextInt();
        int myFavoriteNumber = 35;
        if (favoriteNumber == myFavoriteNumber) {
            System.out.println("BINGO");

        } else {
            System.out.println("try again later");
        }

    }}