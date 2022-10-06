package day13_Scanner;

import java.util.Scanner;

public class next_Practice {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("enter your first name");
        String firstName = scan.next();// Cybertek school ,will be scanner's memory

        scan.next(); //school //this statement will take whatever left after the first enter
        System.out.println("enter your gender");// will be taken next method Automatically
        String lastName = scan.next();

        String fullName = firstName+" "+ lastName;
        System.out.println("Full name is: " +fullName);

    }
}
