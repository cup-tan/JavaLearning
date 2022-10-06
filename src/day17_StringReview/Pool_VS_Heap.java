package day17_StringReview;

public class Pool_VS_Heap {

    public static void main(String[] args) {

       String s1 = "Cybertek"; // String pool
       String s2 = "Cybertek"; // String pool  // string pool will create only one object

        String s3 = new String("Cybertek"); // heap
       String s4 = new String("Cybertek"); //heap // new keyword will be create new object //total 2 object
        //total 3 objects

        String s5 = "cybertek"; // String pool . in java case is sensitive . created new object in the string pool


        System.out.println(s1 ==s2); //true . they are the same

        System.out.println(s1 == s3); // heap

        System.out.println(s3 ==s4);// false not in the same location 2 different objects

        System.out.println(s5 == s2); // false

        System.out.println(s5 == s1);//false


    }
}
