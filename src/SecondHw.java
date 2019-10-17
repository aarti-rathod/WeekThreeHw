/**
 * Created by JANVI on 10/08/2019.
 */

/*2.	Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11

        Expected Output

        Sum of two binary numbers: 101
*/                                                        //done with method
    import java.util.Scanner;

public class SecondHw {
    public static void main ( String [] args ){

        bin_convert();


    }

    public static void bin_convert(){
        Scanner sw=new Scanner( System.in );                        //scanner object

        System.out.print("please enter first binary number  : ");
        int a=Integer.parseInt(sw.nextLine(),2); //                  // syntax

        System.out.println( "please enter second binary number");
        int b= Integer.parseInt(sw.nextLine(),2);


        int e= a+b;
        System.out.println(Integer.toBinaryString(e));              //synax

    }


}
