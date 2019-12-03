package day08;
import  java.util.ArrayList;
import java.util.Scanner;
    public class play1 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String item1=scan.next();
            int count1=scan.nextInt();
            double price1=scan.nextDouble();
          ArrayList<String> groups= new ArrayList<>();
          groups.add(item1);
            System.out.println(groups);

        }
    }
