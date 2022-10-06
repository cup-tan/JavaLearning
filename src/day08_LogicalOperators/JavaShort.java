package day08_LogicalOperators;

import java.util.Scanner;

public class JavaShort {
    public static void main(String[] args) {

        int books = 50;
        if ( books < 10) {
            // books = books +10;
            books += 10;

        }
        System.out.println(books);


        boolean succeedFromExam = true;

        if (succeedFromExam){
            System.out.println(" get A");
        }
        else {
            System.out.println( "get failed");
        }

      /*  Scanner input = new Scanner(System.in);
        System.out.println(" enter username and password");

         String username = input.next();
         String password = input.next();

        String validuserName = "aslihan";
        String validpassword =" 123dfhy";

        if (username == validuserName && password == validpassword){
            System.out.println("access granded");
     // if ( username.equals(validuserName) && password.equals(validpassword)){}
        } else{
            System.out.println("denied");
        }*/

       Scanner input = new Scanner(System.in);
        System.out.println(" enter your current speed");

       int currentSpeed = input.nextInt();

       if (currentSpeed >60){
           System.out.println("Slow down");
           int difference = currentSpeed -60;
           currentSpeed -= difference;
       }else{
           System.out.println("keep driving");

       }

       int score = 500;

       if ( score > 500){
           System.out.println("wonderfull");
       } else if (score<= 500){
           System.out.println("great");
       }else if (300 < score && score < 500) {
           System.out.println(" good");
       }else{
           System.out.println("failed");
       }












    }
}
