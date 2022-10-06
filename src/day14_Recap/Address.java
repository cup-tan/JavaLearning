package day14_Recap;
/*
  1. write a program for the shipping info that, the program should ask:
                    building number  ==> (nextInt)
                    Street address (Assume it has more than one word) ==>nextLine
                    city name   ==> nextLine()
                    state name next()
                    zip code nextInt()
                    // take out the enter we need to use  one more nextLine method
                    full name of the person: nextLine()

            and prints the ship to info in the following format:

            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */


import java.util.Scanner;
public class Address {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("enter your street address");
        String address = input.nextLine();

        System.out.println("enter city name");
        String cityName = input.nextLine();

        System.out.println(" enter state name");
        String stateName = input.next();


        System.out.println("enter zipcode");
        int zipcode = input.nextInt();


        input.nextLine();

        System.out.println("enter your full name");
        String fullname = input.nextLine();

/*
ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
        System.out.println("\nship to: " +fullname +"\n" +buildingNumber + " " +address+"\n" +cityName+", "+stateName+" "+zipcode);







    }
}
