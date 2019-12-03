import java.util.Scanner;

public class firstScannerProgram {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Hello what is your name ? ");
        String firstName=scanner.next();
        System.out.println(" You have entered :" +firstName);

        System.out.println("How old are you ? ");
        int myage=scanner.nextInt();
        System.out.println(" You are " +myage +" years old.");

    }
}
