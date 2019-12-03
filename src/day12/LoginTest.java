package day12;

public class LoginTest {
    public static void main(String[] args) {
        String username="user123", password="pass12";
        if (username.equals("user123") && password.equals("pass123")){
            System.out.println("login successful");
        }
        else if (!username.equals("user123")){
            System.out.println("username is not correct");
        }
        else if (!password.equals("password123"))

        {           System.out.println("password is not correct");}
    }
}
