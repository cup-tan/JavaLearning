package day21_Loops;

import java.util.Scanner;

/*
4. write a program that can divide two numbers without using / & % operators and returns the division and remainder

      ex:
                input:  10
                        3

                Output: 3 with a remainder of 1

               10/3 = 3


               10 - 3 = 7
               7 - 3 = 4;
               4 - 3 = 1

               3/3
               3-3 = 0


 */
public class DivideTwoNumbers {

    public static void main(String[] args) {

     //   Scanner scan = new Scanner(System.in);
      //  int input = scan.nextInt();

        int a = 15;
        int b = 3;


        if ( b == 0){
            System.out.println("invalid input");
            System.exit(0);
        }



        int count = 0;

        while ( a >= b){
            a -= b;
            count++;
        }

        System.out.println(count +" with a remainder of "+a);










    }
}
