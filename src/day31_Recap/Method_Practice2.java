package day31_Recap;
/*
1. create a method that can reverse a string
2. identify if a string is palindrome
 */
public class Method_Practice2 {


    public static void main(String[] args) {
        String name = "madam";

        reverse1(name); // compare with original value

      //  System.out.println(reverse1(name));
      //  System.out.println(name.equalsIgnoreCase(reverse1(name)));  // compile error




        String rev = reverse2(name);

        System.out.println(reverse2(name));

        System.out.println(name.equalsIgnoreCase( reverse2(name)) );
    }

    public static void reverse1(String str){
        String expectedResult = "";
        for (int i = str.length()-1; i >= 0; i--){
           expectedResult += str.charAt(i);
        }
    //  return expectedResult; // because void method cannot allow the any value out from the method.
        // you have to give different return-Type
        // return value has to match return type
    }
    public static String reverse2(String str){
        String expectedResult = "";
        for (int i = str.length()-1; i >= 0; i--){
            expectedResult += str.charAt(i);
        }
        return expectedResult; // because void method cannot allow the any value out from the method.
        // you have to give different return-Type
        // return value has to match return type
}}
