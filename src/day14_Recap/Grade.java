package day14_Recap;

import java.util.Scanner;

/*
 1. write a program that can calculate the grade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry

            MUST use Scanner and nested IF

            if	0 <= score <= 100 ==> valid
            else ==> Invalid Entry

 */
import java.util.Scanner;
public class Grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
            // scan.close(); // closes the scanner and we will not be able to use if afterward
        //it just gets slower ,but it will work
        // performances will be slower

        String result = "";

        if (score >= 0 && score<= 100){ // 5 possible outcomes
           if ( score >= 90  ){
               result = "excellent";

           }else if ( score >= 80){
               result = "great";
           }else if ( score >= 70){
               result = "good";
           }else if ( score >= 60){
               result = "passed";
           }else{
               result = "failed";
           }

        }else{
            System.out.println("invalid ");
        }
        System.out.println(result);












    }
}
