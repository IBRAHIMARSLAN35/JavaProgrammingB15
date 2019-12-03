package day15;
public class WarmUpTask {
    public static void main(String[] args) {
        String name="Ibrahim";
        if(name.length()<4){
            System.out.println("short name");
        } else if (name.length()>=4 && name.length()<10){
            System.out.println("medium name");
        } else {
            System.out.println("longer name");
        }
        if (name.contains("a") || name.contains("e")){
            System.out.println("myname contains a or e");
        }else{
            System.out.println("I dont have both a or e in my name");
        }
    }
}
