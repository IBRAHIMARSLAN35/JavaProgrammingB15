package day14;
public class PasswordValidator {
    public static void main(String[] args) {
                String password="AbH27$3gfgdsu";
                if (8<= password.length() && password.length()<= 16){
                    if (password.contains("_") || password.contains("$")){
                        if (password.startsWith("Ab")){
                            if(!password.contains(" ")){
                                System.out.println("Good password");
                            }else{
                                System.out.println("INVALID PASSWORD");}
                        }else{
                            System.out.println("INVALID PASSWORD");}
                  }else{
                        System.out.println("INVALID PASSWORD");}
           } else{
                    System.out.println("INVALID PASSWORD");}
    }
}
