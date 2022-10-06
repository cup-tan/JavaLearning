package day20_WhileLoops;

import java.util.Scanner;

/*
3. write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); // "ab"
        //            0123
        String result ="";              // in order to removed the duplicate , every single character by one by

        for ( int i = 0; i <= str.length() -1; i++){
                             //   // = is included
        //  String s = "" + str.charAt(i); // a, a, b, b
           String s= str.substring(i, i+1);
            if (!result.contains(s)){ // if the character is already contained in result, we will not add it again
                result += s;
                              //   continue;  sub !
            }

                                // result += s;
        }
        System.out.println(result);








    }
}
