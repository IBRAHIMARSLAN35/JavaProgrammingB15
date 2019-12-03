package day05;

import java.util.Scanner;

public class play1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName=scan.next();
        System.out.println("Enter your last name");
        String lastName=scan.next();

        System.out.println("Enter your email");
        String email=scan.next();

        System.out.println("Enter your street");
        String street1=scan.next();
        String street2=scan.next();
        String street3=scan.next();
        String street4=scan.next();
        System.out.println("Enter your city");
        String city=scan.next();
        System.out.println("Enter your state");
        String state=scan.next();
        System.out.println("Enter your zip code");
        int zipcode=scan.nextInt();
        System.out.println("Enter your work phone number");
        Long workPhoneNumber=scan.nextLong();
        System.out.println("Enter your personal phone number");
        Long personalPhoneNumber=scan.nextLong();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your height");
        double height=scan.nextDouble();
        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried=scan.nextBoolean();
        String fullName=lastName+", "+firstName;
        String address=street1+" "+street2+" "+street3+" "+street4+", "+city+", "+state+" "+zipcode;
        String contacts="work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+email;
        System.out.println("Patient personal information");
        System.out.println("Full name: "+fullName);
        System.out.println("Address: "+address);
        System.out.println("Contacts: "+contacts);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+isMarried);





    }
}