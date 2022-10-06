package day15_String;



import java.util.Scanner;

public class SelfPracticeProject {

/*
    task:
            1. write a program that ask user to enter sentence.
    then print out the first and last characters */

    public static void main(String[] args) {


        String name ="My glass castle";

        char chr1 = name.charAt(0);
        System.out.println(chr1);

       char chr2 = name.charAt(14);
        System.out.println(chr2);

        // index == > int
        int l = name.length();
        int lastLength = name.length() -1;
        System.out.println(l);
        System.out.println(lastLength);
        // last index number -1

      char lastChr2 = name.charAt(14);


        System.out.println("=====================");
/*
2. write a program to ask user to enter first name and last name
			then print the full name in all upper case

 */
      Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = firstName+" " + lastName;
        fullName = fullName.toUpperCase();

        System.out.println( "your full name is : "  + fullName);






    }
}
