package day14_Recap;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
import java.util.Scanner;
public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your gender");
        String gender = input.next();


        System.out.println("enter your age");
        int age = input.nextInt();

        input.nextLine();// enter enter
        System.out.println("enter your country name");
        String countryName = input.nextLine();

        System.out.println("enter your zipcode");
        int zipcode = input.nextInt(); // zipcodeenter

        input.nextLine(); // take out enter    // eger nextline dan once diger methodlar kullanildiysa araya nextline koyuyoruz
        System.out.println("enter your full name");
        String fullName = input.nextLine();







    }
}
