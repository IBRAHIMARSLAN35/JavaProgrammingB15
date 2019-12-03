package day11;

public class WarmUpLightOff {
    public static void main(String[] args) {
String targetOption="Bd";

        switch (targetOption) {
            case "Bd": {
                targetOption = "bedroom";
                System.out.println("you have turned on the " + targetOption + " light");
                break;
            }
            case "ki": {
                targetOption = "kitchen";
                System.out.println("you have turned on the " + targetOption + " light");
                break;
            }
        }
    }
}
