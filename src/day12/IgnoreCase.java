package day12;

public class IgnoreCase {
    public static void main(String[] args) {
        String username="ibraHIM ARSlaN";
        boolean userNameCorrect=username.equals("ibrahim arslan");
        System.out.println(userNameCorrect);
        boolean nameCheckIgnoreCase=username.equalsIgnoreCase("IBRAHIM ARSLAN");
        System.out.println(nameCheckIgnoreCase);
    }
}
