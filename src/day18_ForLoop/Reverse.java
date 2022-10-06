package day18_ForLoop;

import java.util.Scanner;

/*
2. write a program that can reverse the following string:

                String str = "Java";
                output: avaJ

            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method

 */
public class Reverse {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        String str = scan.next();

       String s1 = str.substring(1);// ava
        String s2 =str.substring(0,1); //J
      //  char ch1 = str.charAt(0);
        String result = s1+s2 ;

        System.out.println(result);





    }
}
