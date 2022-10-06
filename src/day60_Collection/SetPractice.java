package day60_Collection;

import java.util.*;

public class SetPractice {
    // write a program that can remove duplicates from string


    public static void main(String[] args) {

        String str ="aaabbbccccdddeee";  // abcde

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));  // [a, a, a, b, b, b, c, c, c, c, d, d, d, e, e, e]

        // {a, b, c, d, e};


        Set<String> s1 = new HashSet<>();
        s1.addAll( Arrays.asList(arr) ); // [a, b, c, d, e]

        System.out.println(s1);

    //check github code


        String str2 = "zzzzyyyyxxx";
         str2 =  new LinkedHashSet<>( Arrays.asList(  str2.split("") ) ).toString() ; // it does accept collection type

             System.out.println(str2); // [z, y, x]

         str2 = str2.replace("[","").replace(", ","").replace("]","");

              System.out.println( str2 ); //  zyx


        System.out.println("=============================================");
        /*
        1. write a program that can identify if two strings are build out of same characters
		ex:
			str1 = "abcabc"
			str2 = "cab"

			output:
				true
         */
       String a1 = "abcabc"; // a b c
       String a2 = "cabbbc"; // a b c

        HashSet<String> b1 = new HashSet<>();
        b1.addAll( Arrays.asList( a1.split("") ) );

        System.out.println(b1); // [a, b, c]

       HashSet<String> b2 = new HashSet<>();
       b2.addAll( Arrays.asList( a2.split("") ) );

        System.out.println(b2); // [a, b, c]


        a1 = b1.toString();
        a2 = b2.toString();

        System.out.println(b1.equals(b2)); // true


        System.out.println("=========================================");
        String x1 = "cacacabb";
        String x2 = "bbcaaaaa";

         x1  =   new TreeSet<String>( Arrays.asList( x1.split("") ) ).toString(); //a b c       // toString , every single character has
         x2  =   new TreeSet<String>( Arrays.asList( x2.split("") ) ).toString();// a b c

        System.out.println(x1.equals(x2));

        System.out.println("=========================================");

        String[] names = {"Aalia", "Mustafa","Elkem","Aalia", "Aalia", "Virginia"};
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll( Arrays.asList( names ));

        System.out.println( set1 ); // [Aalia, Mustafa, Elkem, Virginia]

        names = set1.toArray( new String[0]); // converting collection type to Array

        System.out.println( Arrays.toString(names)); // [Aalia, Mustafa, Elkem, Virginia]

        System.out.println("============================================================");
        String[] names2 = {"Roman", "Abzal", "Nurbiye", "Roman","Roman", "Roman", "Roman", "Roman" };
                                                                     // random number 0
       names2 = new LinkedHashSet<>( Arrays.asList(names2)).toArray(new String[0]);

        System.out.println( Arrays.toString(names2)); // [Roman, Abzal, Nurbiye]

        System.out.println("==============================================================");
        Integer[] numbers = {1,1,1,2,2,2,2,0,0,0,0,0,1,1,1,2,3,4,5,6,7,8,9};

        numbers = new LinkedHashSet<>( Arrays.asList( numbers)).toArray( new Integer[0]);

        System.out.println( Arrays.toString(numbers)); // [1, 2, 0, 3, 4, 5, 6, 7, 8, 9]
        // after hashset ==> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    }



}
