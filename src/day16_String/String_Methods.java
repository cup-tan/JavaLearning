package day16_String;

public class String_Methods {

    public static void main(String[] args) {


        // replace method
        String email = "cybertek@gmail.com";

       email    = email.replace("gmail", "yahoo");

        System.out.println(email);


        String word = "Java";// never modified,only returns other one
            word =  word.replace("a", "e");


        System.out.println(word);

        String  sentence  = "I like to learn Java, Java is cool, Java is fun";
          sentence = sentence.replace("a, Java" ,"a, C#");

           sentence  = sentence.replace("Java ", "Python ");

        System.out.println(sentence);


        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; //MIT

        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);
        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java"; //r

        s2 = s2.replace('R', 'r');
        System.out.println(s2);

      // replaceFirst:

        String s3 = "I like to drink tea and tea";
       s3 = s3.replaceFirst("tea", "cola");

        System.out.println(s3);

        String s4 = "I like to watch Game of thrones, and walking dead";
        s4 = s4.replace(", and walking dead", "");
        System.out.println(s4);


        //indexOf()
        String s5 = "i like to stay in cybertek, we are learning java";
       int r1 =  s5.indexOf("r");// returns first character "r" index number
       int r2 = s5.indexOf("re");// "ar" ==.> gives a nin index number. +1 ekle
       int r3 = s5.indexOf("rn");

        System.out.println(r1);
        System.out.println(s5.charAt(r1));
        System.out.println(r2);
        System.out.println(r3);

        //lastIndexOf():
// last matching character of index number
        String s6= "Java is a programming language, and Java is fun";

       int I1 = s6.indexOf("J")+1 ;// gives next character
       int I2 = s6.lastIndexOf("J"); //last occurred 'J'
        System.out.println(I1);
        System.out.println(I2);

       String s7 = "Java";
        int a1  =   s7.indexOf("A"); //always return integer.. it will return me negative number (-1)==>
        //-1 ===> means not exist because not exist
        System.out.println(a1);

        // tried double instead of int for index number
        String s8 = "Java";
        int a = s8.indexOf("a");
       //double a = s8.indexOf("a");// index character not decimal number
        // later on when you create charAt method ,it gives compile error
        // char ch = s8.charAt((int)a);

        System.out.println(a);


    }
}
