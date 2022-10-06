package day30_CustomMethods;

import java.util.Locale;

public class ReturnMethods2 {


    public static void main(String[] args) {
        String name = "Level";
        // revStr1(name); // just print we cannot use as a value
        //  System.out.println(name.equalsIgnoreCase(""));

      // String reversedName = revStr2(name);
        System.out.println(name.equalsIgnoreCase(revStr2(name)) );
    }

    public static void revStr1(String str) { // we cn only use those values with this method
        String result = ""; // we can only print out reverse value
        for (int i = str.length() - 1; i >= 0; i--) {
            int each = str.charAt(i);
            result += each;
        }
    }

    public static String revStr2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
         //   int each = str.charAt(i);
            result += str.charAt(i);
        }
        System.out.println(result);
        return result;
    }
}