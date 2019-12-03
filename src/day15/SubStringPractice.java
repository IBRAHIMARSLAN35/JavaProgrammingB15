package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        String movie="Lord Of The Ring";

        String wordOf=movie.substring(5,7);
        System.out.println("wordOf="+wordOf);
        String wordThe=movie.substring(8,11);
        System.out.println("wordThe="+wordThe);

        int startingPoint=movie.indexOf(" ")+1;
        int endingPoint=movie.length();

        System.out.println("second word till last :"
                +movie.substring(startingPoint,endingPoint));
        String secondWordTillLast=movie.substring(5,16);
        System.out.println(secondWordTillLast);
        System.out.println(movie.substring(12,16)+" "+movie.substring(5,7)+" "+movie.substring(8,11)+" "+movie.substring(0,4));

        System.out.println("---------------------------------------");
        // char[] ch=movie.toCharArray();
        // for(char cr:ch){
        //System.out.println(cr);}
        //System.out.println("---------------------------------------");

        /* char[] cr=veggie.toCharArray();
        for(char chary:cr){
            System.out.println(chary);} */
        String veggie="I love Pumpkin,Pumpkin IS FUN";
        veggie=veggie.replace("Pumpkin","Java!");
        System.out.println(veggie);


        String message2="Happy Thanks Giving to All!";
        message2=message2.replace("Thanks Giving","thanksgiving");
        System.out.println(message2);


        message2=message2.replace(" ","");
        System.out.println(message2);


    }
}
