package day23_Arrays;
/*
3. write a program that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2

                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character.
                         you will need to repeat the same steps
 */
public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "ABAB"; // "A2B2"
        String nonDub = ""; //"AB"
        String result =""; // "A2B2"


        for (int i = 0; i <= str.length()-1; i++){  // removing dublicates from str
               String ch = "" + str.charAt(i);
               if (!nonDub.contains(ch)){
                   nonDub += ch;
               }

        }

        System.out.println(nonDub); // AB

        // str = "ABAB"  nonDub  = "AB"            frequency
                          // j: is index number of nonDub
       for (int j = 0; j <= nonDub.length() -1; j++){
           char ch = nonDub.charAt(j);    // same step twice
           int count = 0; // 2

           for (int i = 0; i <= str.length()-1; i++){
               // char each = str.charAt(i);

               if (str.charAt(i) == ch){
                   count += 1;
               }
           }
          result += ""+ ch +count;
       }

        System.out.println(result);

     /*  result += nonDub.charAt(0) +""+ count ;

        char ch2 = nonDub.charAt(0);    // same step twice
        int count2 = 0; // 2

        for (int i = 0; i <= str.length()-1; i++){
            // char each = str.charAt(i);

            if (str.charAt(i) == ch2){
                count2 += 1;
            }
      */







    }
}

