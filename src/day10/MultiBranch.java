package day10;
import java.util.Scanner;
public class MultiBranch {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald's, what can I get for you");
        // 11 burger 5fries 8nuggets 35ice cream 55coke
        String order="";
        Scanner scan=new Scanner(System.in);
        int itemNumber=scan.nextInt();
        System.out.println("Enter  your budget");
        int budget=scan.nextInt();
        int price,minute;
        switch (itemNumber){
            case 11:
                order="Burger";
                minute=9;
                price=12;
                System.out.println("You have selected number 55. Your order is "+order+" and price for the item is "+price+" $ and it will be ready within "+minute+" minutes");
                System.out.println("You have "+ (budget-price)+" $ left");
                System.out.println("Thank you for shopping on McDonal's. Enjoy your meal.");
                break;
            case 5:
                price=4;
                minute=5;
                order="French fries";
                System.out.println("You have selected number 5. Your order is "+order+" and price for the item is "+price+" $ and it will be ready within "+minute+" minutes");
                System.out.println("You have "+ (budget-price)+" $ left");
                System.out.println("Thank you for shopping on McDonal's. Enjoy your meal.");
                break;
            case 8:
                price=8;
                minute=7;
                order="Nuggets";
                System.out.println("You have selected number 8. Your order is "+order+" and price for the item is "+price+" $ and it will be ready within "+minute+ " minutes");
                System.out.println("You have "+ (budget-price)+" $ left");
                System.out.println("Thank you for shopping on McDonal's. Enjoy your meal.");
                break;
            case 35:
                price=3;
                minute=2;
                order="Ice cream";
                System.out.println("You have selected number 35. Your order is "+order+" and price for the item is "+price+" $ and it will be ready within "+minute+" minutes");
                System.out.println("You have "+ (budget-price)+" $ left");
                System.out.println("Thank you for shopping on McDonal's. Enjoy your meal.");
                break;
            case 55:
                price=2;
                minute=1;
                order="Coke";
                System.out.println("You have selected number 55. Your order is "+order+" and price for the item is "+price+" $ and it will be ready within "+minute+" minutes");
                System.out.println("You have "+ (budget-price)+" $ left");
                System.out.println("Thank you for shopping on McDonal's. Enjoy your meal.");
                break;
            default:
                System.out.println("Enter the correct item number");

    }
}}
