/**
 *
 * //4.	Write a Java program to convert a decimal number to binary number.
 Input Data:
 Input a Decimal Number : 5
 Expected Output

 * Created by JANVI on 10/08/2019.                             //done with method
 * Binary number is: 101
 */
import java.util.Scanner;

public class ForthClass {

    public static void main (String [] args ){

        Scanner obj=new Scanner(System.in);                                       //creat a object for scanner
        System.out.println("Enter decimal number:");

        int c=obj.nextInt();

        System.out.println("Binary number is : "+Integer.toBinaryString(c));            //syntax

    }
}
