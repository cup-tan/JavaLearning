package day15_String;
import java.lang.String;
import java.util.Scanner;
public class String_Intro {

    public static void main(String[] args) {
        String str = "Cybertek";
        Scanner input = new Scanner(System.in);


        String name = "cybertek"; // String literal
        String name2 = new String( "cybertek");

        String s1 = "Cat"; // String literal
        String s2 = "Cat"; // String literal

        System.out.println(s1 == s2);
//                        "Cat"== "Cat" same object ==> true
        String d1 = "Dog"; //String literal
        String d2 ="Dog";// String literal

        System.out.println(d1 == d2);


        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println( t1 == t2);
//               new String("Tiger") == new String("Tiger") ===>false


        System.out.println("=========================");
        String str1 = "Java";// string literal
             str1 = "Javascript"; // reassigned

        System.out.println(str1);
        str1 = "Java";

        System.out.println(str1);






    }
}
