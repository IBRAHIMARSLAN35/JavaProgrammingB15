package day09;
import java.util.Scanner;
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myNumber = scan.nextInt();
        if (myNumber % 2 == 0) {
            System.out.println("This is a even number");
        } else {
            System.out.println("This is a odd number");
        }
    }}
