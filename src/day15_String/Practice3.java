package day15_String;

import java.util.Scanner;

public class Practice3 {


    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");

        String sentence = scan.nextLine();


        int lastIndexNum = sentence.length() -1 ;


        System.out.println("" +sentence.charAt(0) +   sentence.charAt( lastIndexNum ) );  //for concate we need to string
        //                   "J"              +            "n"
        //    eger quotation mark sa will be string              74                +     110    = 184                    on ASCII TABLE



        System.out.println(sentence.charAt(0)  );
        System.out.println(sentence.charAt(sentence.length() - 1)); // gives last index number





    }
}
