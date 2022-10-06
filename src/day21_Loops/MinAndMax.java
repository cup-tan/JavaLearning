package day21_Loops;

import java.util.Scanner;

/*
 3. write a program that asks user to enter 5 numbers and returns the minimum number and maximum
 */
public class MinAndMax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int max = -848347974; // any user entered number input WILL BE greater than  -848347974
        int min =  489802398;// any user entered number input WILL BE less than 489802398
        for ( int i = 1; i <= 5; i++){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num > max){
                max = num;
            }


            if (num < min){
                min = num;
            }

        }

        System.out.println("max number is: " +max);

        System.out.println("min number is: "+min);   // put after for loop block



    }

}
