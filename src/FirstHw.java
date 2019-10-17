/**
 * Created by JANVI on 10/08/2019.
 */

//1.	Write a Java program to swap two variables

public class FirstHw {

   static  int x=4;
    static int y=6;
    static int z;

    public static void main (String [] args ){
                                                            //done with method
        //int x=4;
        //int y=6;
        //int z;

        System.out.println( "X and Y value before swaping  :"+ x  +  y );


        z=x;
        x=y;
        y=z;

        System.out.println( " X and Y value after swaping :"+x+ "," + y);




    }
}
