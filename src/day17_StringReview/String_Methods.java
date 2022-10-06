package day17_StringReview;

public class String_Methods {
/*
String Methods: charAt, + == sadece string de eklenebiliyor sayi operator doesn't matter
, length, upper, lower, trim, substring, replace,replaceFirst,indexOf,lastIndexOf,

  related to boolean ==> isEmpty,ends,starts,contains,equals, equalsIgnoreCase,
 */

    public static void main(String[] args) {
       String str = "Cybertek";// we can get specific character with charAt methods of string
     //              01234567

        //charAt(index) ==> char ... variable
        char ch1 = str.charAt(7);

        System.out.println(ch1);

        // +:
        String str2 = "Cybertek"; // we cannot modified
         str2 = str2+ " " +"school"; // create new object

        System.out.println(str2);


        // length(): ==> return int . it counts total numbers of the characters. and it starts  from 1
        String str3 = "Cybertek";
        //             01234567
        int l = str3.length();

        System.out.println("length: " + l); //gives 8  is the length
        // NOTE
        // eger subtract -1 yaparsak .index olarak last index number i verir.
        // str3.length() - 1 ===> last index number


       // lastIndex: length -1

         char ch2 = str3.charAt(l -1); // it doesn't accept string. not exist
        // index min == 0 not call negative number.. gives error message
        System.out.println(ch2);  //gives last index , return me "k"

        System.out.println( "last index:  " + (l-1));


        // upperCase & lowerCase():
        // they will create new string

           String str4 = "cybertek";
                  str4 = str4.toUpperCase(); // "CYBERTEK"

        System.out.println(str4);

        String str5 = "JAVA";
              str5 =  str5.toLowerCase(); //"java"
        System.out.println(str5);

        // trim(): removed unused spaces
          String str6 = "         Cybertek       ";
          System.out.println(str6);

           str6 = str6.trim();
        System.out.println(str6);

        // substring // partially string// ENDING INDEX IS EXCLUDED. BEGINNING INDEX IS INCLUDED

        String str7 = "I like Java Language";
//                     012345678910

       String word = str7.substring(7,10 +1 );// "java"  end the index is excluded ,so we add +1
        System.out.println(str7);
        System.out.println(word);

        String word2 = str7.substring(12, str7.length());// it is beginning til the end.
        String word3 = str7.substring(12);

        System.out.println(word2);        //second last index so we need to add +1
        System.out.println(word3);

      String word4 = str7.substring(2,5 +1);
        System.out.println(word4);


      //indexOf() & lastIndexOf() ===> return index number INT,,CANNOT BE DECIMAL

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";

       int i1 =  str8.indexOf("W"); // index number = 23
        System.out.println(i1);
        System.out.println(str8.charAt(i1));// 'W'

        int i2 = str8.indexOf(", W")+2;
        int i3 = str8.indexOf("We");
        System.out.println(i2);//38
        System.out.println(i3);//38
        System.out.println(str8.charAt(i2));


        String str9 = "Java Java Java";
        //             012345678910
         int i4  =  str9.lastIndexOf("J");
         int i5  = str9.indexOf("J");
         int i6 = str9.indexOf(" Java ") +1; //5

        int i7 = str9.lastIndexOf("Java ");
         System.out.println(i4); //10
         System.out.println(i5); //0
         System.out.println(i6); //5
         System.out.println(i7); //5


        // replace() && replaceFirst():
          //all of them && first one

        String s1 = "I like Java, Java is a programming language";
          s1 = s1.replace("Java"," C#");// returns me  new string

        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
         s2 = s2.replaceFirst("Java", "C#");
        System.out.println(s2);

       String s3 = "I like Java, Java is a programming language";
       s3 = s3.replaceFirst("Java is", "C#");
        System.out.println(s3);












    }
}
