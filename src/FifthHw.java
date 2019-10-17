/**
 * //5.	 Write a Java program and compute the sum of the digits of an integer. Go to the editor
 Input Data:
 Input an integer: 25
 Expected Output
 The sum of the digits is: 7

                                  //done with method

 * Created by JANVI on 10/08/2019.
 */
import java.util.Scanner;
public class FifthHw {

    public static void main (String []args){
        System.out.println("Input an Integer::");
        Scanner obj=new Scanner(System.in);

        int num=obj.nextInt();
        int sum=0;

        while (num>0){

            int rem =num%10;                    //reminder value will store in "rem" (which will "5")
            sum = sum+rem;                      // for all reminder addition , use " sum "

            num=num/10;                           //For division answer


        }
        System.out.println("sum of digits"+ sum);





    }

}
