package day20_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practice3 {

    public static void main(String[] args) {

        //Write a program that asks user to enter his/her username and password until user enters correctly.

        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("Enter your password");
        String input = scan.nextLine();


        while(!input.equals(password)){ // get executed until executed becomes false
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }

        System.out.println("Logged in");




    }
}
