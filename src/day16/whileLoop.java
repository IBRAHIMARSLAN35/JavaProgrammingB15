package day16;

public class whileLoop {
    public static void main(String[] args) {
        int x=10;
        while (x-->1){
//       while (x++<5)--->>> prints 1,2,3,4,5 and while (++x<5) --->>> prints 0,1,2,3,4
            System.out.println(x);
            // count comes to loop while (count--  >=1) first it checks it is less than or equal to 1 if true it decreased 1 and continue.
            //count comes to loop while (--count  >=1) first it decreased  1 and then check it is less than or equal to 1.

        }
    }
}
