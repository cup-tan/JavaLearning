package day14_Recap;

import java.util.Scanner;
public class ScannerMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      //  int num = input.nextInt();

     //boolean num =   input.nextBoolean();
    // String num = input.next(); // yes or no
        System.out.println(" Do you want to learn Java?");
        //String num = input.next();
        String num = input.nextLine();


        System.out.println("you have entered "+ num);


    }
}
