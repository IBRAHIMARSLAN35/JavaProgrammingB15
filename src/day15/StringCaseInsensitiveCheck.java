package day15;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {
        String name="Arya Stark";
        System.out.println("1 >>>>>>>>name contains st or not RESULT IS: "+name.contains("st"));

        String uppercaseName=name.toUpperCase();
        System.out.println("2 >>>>>>>>>uppercaseName contains ST or not? "+uppercaseName.contains("ST"));

        String lowercaseName=name.toLowerCase();
        System.out.println("3 >>>>>>>>>>lowercaseName contains ST or not? "+lowercaseName.contains("ST"));

        System.out.println("4 >>>>>>>>>>>>>"+name.toLowerCase().contains("st"));// name.lowerCase is a string and then you can check it contains "st" or not.
        // System.out.println(name.length().toUppercase()); name.length makes it integer so then you can not make is to string


    }
}
