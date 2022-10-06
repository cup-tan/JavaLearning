package day16_String;

import javax.jws.soap.SOAPBinding;
import java.util.SortedMap;

public class String_Methods2 {

    public static void main(String[] args) {
       //isEmpty (): lines are zero
        String name1 ="Cybertek";

        System.out.println(name1.isEmpty()); // false

        String name2 = "";
        System.out.println(name2.isEmpty());//true

         String str1 ="Java"; //String pool
        String str2 = new String("Java"); //heap
        System.out.println(str1 +" : "+str2); // java : java
        System.out.println(str1 == str2); //false
        //equals()

        System.out.println(  str1.equals(str2)  ); //true

        String str3 = new String("Java");
        String str4 = new String("Java"); //two different object
        System.out.println(str3 == str4); //false  ama farkli iki keywords iki farkli object olusturur
        System.out.println(str3.equals(str4));//true bu sadece ayni mi diy ekontrl ediyor


        String str5 = "Java";
        String str6 = "JAva";
        //same object in the String pool

        System.out.println( str5 == str6 ); //true
        System.out.println( str5.equals(str6)); // true   ====> same exact text

        String str7 = "JAVA"; //case is sensitive it is uppercase
        String str8 = "java";

        System.out.println(str7.equals(str8)); //false


        // equalsIgnoreCAse():
        // YES, Yes, yes, yEs ===> yes

        System.out.println(str7.equals(str8)); // true  it doesn't matter if the word id uppercase or lowercase

        //contains():

        String str = "I like to learn java programming language";

        System.out.println(str.contains("python")); //false
        System.out.println(!str.contains("python"));//true


        System.out.println(str.contains("java"));//true
        System.out.println(str.contains("JAVA")); //false

        //startsWith():

        String s1 = "Muhtar";
        System.out.println(s1.startsWith("M"));// true
        System.out.println(s1.startsWith("J")); //false

        System.out.println(s1.startsWith("Mu")); //true

        System.out.println(s1.toLowerCase().contains("mu")); //true
            //           "muhtar




    }
}
