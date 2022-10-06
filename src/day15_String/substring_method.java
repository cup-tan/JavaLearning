package day15_String;

import java.util.Locale;

public class substring_method {

    public static void main(String[] args) {


        String sentence = "Java is fun";
        //                 0123456789...

        //substring(beg index, end index)
        String word1 = sentence.substring(0 ,3+1);// ending index is  always excluded
        System.out.println(word1);

        String word2 = sentence.substring(8 , 11);

        System.out.println(word2);

        System.out.println("===============");

        String sentence2 = "I like Movies and TV Series";
              //            0123456789........
        String word3 = sentence2.substring(7 ,12);

        System.out.println(word3);

        System.out.println("======================");
        String firstName = "cYBerTeK";
        String firstCharacter = firstName.substring(0 ,1);
        String rest = firstName.substring( 1 , firstName.length() );// firstName.length());// last index + one   ===> lenght methos
                                             // lastIndex + 1
        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();


        System.out.println(firstCharacter);
        System.out.println(rest);
        System.out.println(firstName);

        System.out.println("==================================");
        String lastName = "rAMaZan";
                 //        012345
        String firstChar = lastName.substring(0 , 1); // s
        String remaining = lastName.substring(1); // chool
                        // lastName.length() // chool

       lastName = firstChar.toUpperCase() + remaining.toLowerCase(); // lastName( will be new object) i degistirdik yoksa print yapsak school yazardi
        System.out.println(firstChar);
        System.out.println(remaining);
        System.out.println(lastName);

        System.out.println("==================================");

        String s = "I like Game of Thrones";
                  //0123456789
        String series = s.substring( 7);

        System.out.println(series);

        String s2 = "I like Java programming Language";
        //           01234567 ===> index number

        String language = s2.substring(7);

        System.out.println(language);











    }
}
