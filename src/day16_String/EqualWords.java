package day16_String;
/*
2. ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"

3. write a program that can check if the two strings are equal or not.
 */
import java.util.Scanner;

public class EqualWords {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
           String firstWord = scan.next();

        System.out.println("Enter your second word");
        String secondWord = scan.next();

       /* if (firstWord.equals(secondWord)){
            System.out.println("they are equal");
        }else{
            System.out.println("they are not equal");
        }
        */
  // please checks equals two different objects
        String result = (firstWord.equalsIgnoreCase(secondWord))? "they are equal" : "not equal" ;

        System.out.println(result);
    }
}
