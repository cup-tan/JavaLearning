package day24_Arrays;
                   //ch1 compare with str, ve tek tek occurred ediyor.contains

import java.util.Scanner;

public class Uniques2 {

    public static void main(String[] args) {
        //applicable and finding the unique and occurred
        //frequency icin we created "count" variable
     Scanner scan = new Scanner(System.in);
     String str = scan.nextLine();

      //  String str = "aabccdeeeeffffffjhhhhhhi";// only frequency of first character
        //unique is frequency                 y is 1
        String expectedResult = "";


        for (int j = 0; j<= str.length()-1;j++){// because we need the frequency of evey single character

            char ch1 = str.charAt(j);// a a b c c
            int count = 0;  // 1+1 // frequency of ch

            for (int i = 0; i <= str.length() -1; i++){ // used for finding the frequency of ch and assign i

                char each = str.charAt(i); // a  a  b  c  c
                if (ch1 == each){ // dogruysa ch1 occurred with str
                    count+=1;

                }
            }
            if (count == 1){// if it only occured one time

                expectedResult += ch1;
            }
        }


        System.out.println(expectedResult);











    }
}
