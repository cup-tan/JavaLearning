package day31_Recap;
/*
3. use the methods removeDup and frequency in util class to create a thrid method called frequencyOfChars that can find the frequency of all characters from a string
		Ex:
			frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
			frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3


			"AABBBCCC"  ==> A2B3C3

			remove duplicates ==> A B C
			frequency ==>         2 3 3

			A2B3C3

			FrequencyOfCharacters
 */
   import Library.Util;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = ("AAABBBBCCCCDDDEEFFFGGG");

        String expectedResult = ""; //===> A3B4C4

        String nonDub = Util.removeDup(str);// ==>ABC
        //that's the return method that returns us nonDub character from the string

        // if it is static , we can call the method with class name

        for (char each : nonDub.toCharArray()) {
            int count1 = Util.frequency(str, each);
            expectedResult += "" + each + count1;
        }
        System.out.println(expectedResult);

        System.out.println("=========================================");

        String str2 ="wwweeeeerrrrrrrtttyyuuu";

         String expectedResult2 = frequencyOfChars(str2);

        System.out.println(expectedResult2);



     /*   for (int i = 0; i <= nonDub.length()-1; i++){
            char ch1 = nonDub.charAt(i);
            int count1 = Util.frequency(str,ch1);
            expectedResult += ""+ch1 +count1;

        }
        System.out.println(expectedResult);
*/

      /*  char ch1 = nonDub.charAt(0); //A
        int count1 = Util.frequency(str, ch1);//3
        expectedResult += ""+ ch1 +count1;

        char ch2 = nonDub.charAt(1); //A
        int count2 = Util.frequency(str, ch2);//3
        expectedResult += ""+ ch2 +count2;

        char ch3 = nonDub.charAt(2); //A
        int count3 = Util.frequency(str, ch3);//3
        expectedResult += ""+ ch3 +count3;
       */

    }

    public static String frequencyOfChars(String str){

            String expectedResult = "";
            String nonDub = Util.removeDup(str);

            for ( char each : nonDub.toCharArray()){
                int count1 = Util.frequency(str,each);
                expectedResult += ""+each +count1;
            }
            return expectedResult;


    }












}
