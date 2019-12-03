package day18;

public class ForLoopIntro {
    public static void main(String[] args) {
        //for loop () has 3 parts seperated by;
        // first part initialization
        //it will run once when you enter the loop
        // second part termination condition:
        //loop will stop if it's false
        // it will be checked every time
        // third part increment or decrement to change condition eve
        // it will run after each iteration


        for(int i=1;i<=5;i++) {
            System.out.println("i = " + i);
            System.out.println("Happy birthday Roksana Botcieva");
        }

        for(int counter=5;counter>0;counter--){
            System.out.println("counter = "+counter);}

        for(int even=0;even<=100;even +=2){
            System.out.println("even numbers = "+even);
        }
        for (int x = 0; x <=100 ; x++) {
            if(x%5 ==0 && x%3==0){
                System.out.println(x+" FIZZ BUZZ NUMBER");
            }
        }
        }
    }

