package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {

    public static void main(String[] args) {
        String str = "catcatcatdogdog";
        //(0,3)


        int count = 0; // "cat"     // each 3 characters of the string
        for (int i = 0; i <= str.length()-3; i++){// to avoid index number out of bound so we -3
            if( str.substring(i,i+3).equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println(count);

          Scanner scan = new Scanner(System.in);
          String str1 = scan.nextLine();
          String word = scan.next();
          int l = word.length();

    }
}
