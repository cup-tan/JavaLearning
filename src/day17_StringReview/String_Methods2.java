package day17_StringReview;

public class String_Methods2 {
/*
related to boolean ==> isEmpty,ends,starts,contains,equals, equalsIgnoreCase
 */
    public static void main(String[] args) {

   String s1 = "Cat";
   String s2 = new String("Cat");//heap
   String s3 = new String("Cat");
   //equals(): case sensitive
        System.out.println(s1 ==s2);// false

        System.out.println(s1.equals(s2)); // true

        System.out.println( s2 == s3); // false

        System.out.println(s2.equals(s3)); //  true

        // equalsIgnoreCase(): ignore case sensitivity
        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4 == s5);// false
        System.out.println(s4.equals(s5)); //false


        System.out.println(s4.equalsIgnoreCase(s5)); //true

       //isEmpty: checks if the length of string is 0
        String str = " ";

        System.out.println(str.isEmpty());// false because have two spaces

       str = str.trim();// ""
        System.out.println(str.isEmpty());// true

        String str2 = "Cybertek";// length != 0
        System.out.println(str2.isEmpty()); // false

           str2 = ""; //length == 0
        System.out.println(str2.isEmpty());//true


        //contains(): included or not


        




    }
}
