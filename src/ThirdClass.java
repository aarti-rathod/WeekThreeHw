/**
 * Created by JANVI on 10/08/2019.
 *
 *
 * Input Data:
 Input the first binary number: 10
 Input the second binary number: 11
 Expected Output
 Product of two binary numbers: 110

 */
// 3.	Write a Java program to multiply two binary numbers.

import java.util.Scanner;                                  //done with method calling
public class ThirdClass {

    public static void main ( String [] args ){
        Scanner mul=new Scanner( System.in );



        System.out.println("please enter first binary number");
        int a=Integer.parseInt(mul.nextLine(),2);                            //syntax 1 : To Convert Binary To Decimal



        System.out.println( "please enter second binary number");
        int b= Integer.parseInt(mul.nextLine(),2);                           //syntax =two numbers given so taken (2)
                                                                            //if three numbers given than need to taken (3)

        int e= a*b;
        System.out.println(Integer.toBinaryString(e));



    }




}
