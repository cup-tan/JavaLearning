package day21_Loops;

import java.util.Scanner;

/*
       1. write a program that asks user to enter 5 numbers and returns the maximum number
       */
public class MaxNumber {

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

        int max = -1903898439;

        for (int i = 10; i < 50; i += 10){

            System.out.println("Enter a number");
            int num = scan.nextInt(); //10                   // istiyorum ki 5 kes tekrar etsin o yuzden in for loop block
                                                              // entered number replace max number

            if ( num > max){
               max  = num;
            }

        }

        System.out.println("max number is: " +max);












    }
}
