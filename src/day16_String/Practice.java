package day16_String;

import java.util.Locale;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed?");
       // String answer = scan.next().toLowerCase();
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Employed");
        }else{
            System.out.println("not employed");
        }







    }
    }
