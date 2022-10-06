package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {
    /*
    /*
3. write a program that can remove digits and letters for an ArrayList of characters

			list: {a,b,c,3,4,5,6,&,%,@,#,*}
			output: {&,%,@,#,*};
 */


    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(  Arrays.asList('a','1','2','c','d','$','#','@','?','*') );

       chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println(chars);// [$, #, @, ?, *]

        System.out.println("======================================");

        ArrayList<Character> list = new ArrayList<>();
        list.addAll( Arrays.asList('a','1','2','c','d','$','#','@','?','*') );

        ArrayList<Character> digits = new ArrayList<>();// [1,2]
        digits.addAll(list);
        digits.removeIf(p -> !Character.isDigit(p));// if the character is not digit, then remove it from the list

        System.out.println("digits: "+digits);

        ArrayList<Character> letters = new ArrayList<>();// [a,b,c,d]
        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p)); // if the character is not letter, then remove it from the list

        System.out.println("letter: "+letters);


        ArrayList<Character> specialChar = new ArrayList<>();// ['$','#','@','?','*']
        specialChar.addAll(list);
        specialChar.removeAll(digits);
        specialChar.removeAll(letters);

        System.out.println("special Characters: "+specialChar);




    }
}
