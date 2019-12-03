package day14;

public class StringReview {
    public static void main(String[] args) {
        String str="I like Pumpkin";
        System.out.println("str = " + str);


        System.out.println("Does it contain Pumpkin");
        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin=str.contains("Pumpkin");
        // short cut to print variable in nice format soutv+tab;
        System.out.println("gotPumpkin = " + gotPumpkin);

        boolean startedWithI=str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin=str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);
    }
}
