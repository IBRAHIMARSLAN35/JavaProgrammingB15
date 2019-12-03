package day03;

public class PrimitivesPractice {
    public static void main(String[] args) {
        int catCount = 20;
        byte letterCount = 26;
        short sheepCount = 300;
        long mileToMoon= 500000l; // lower l or upper L does not matter
        long mileToSun = 10000000L;
        float priceOfBanana= 1.99f; //lower f or upper F does not matter
        float priceOfPotato= 2.49F;
        double priceOfIpad1=355.99d;
        double priceOfIpadPro= 1024.99D;
        double priceOfMac=2299.99;
        // if you have a whole number by itself , compiler automatically assume it is an integer.
        // if you have a fractional number by itself , compiler automatically assume it is a double.

        System.out.println("I have " +catCount +" cats. :) ");
        System.out.println("In English alphabet there are "+letterCount+" letters");
        System.out.println("I have " +sheepCount +" sheeps. :) ");
        System.out.println("The distance from Earth to Moon is " +mileToMoon +"miles. ");
        System.out.println("The distance from Earth to Sun is " +mileToSun +" miles. ");
        System.out.println("The price of banana in New York is "+priceOfBanana+" dollars");
        System.out.println("The price of potato in Texas is "+priceOfPotato+" dollars");
        System.out.println("The price of Ipad 1 in Apple Store is "+priceOfIpad1+" dollars");
        System.out.println("The price of Ipad Pro in Apple Store is "+priceOfIpadPro+" dollars");
        System.out.println("The price of Macbook in Apple Store is "+priceOfMac+" dollars");


    }
}
