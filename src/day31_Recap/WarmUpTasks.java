package day31_Recap;

public class WarmUpTasks {
    /*
    1.  write a return method called frequency that accepts two parameters:
    string str and char ch, the method returns the frequency of the ch from the str as an int

			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2

			Note: MUST use Arrays and for each loop
     */

    public static void main(String[] args) {
        String str = "aabbccd";
        String uniques = ""; //"bd"

        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        System.out.println(uniques);


        System.out.println("================================");

        String str2 = "ppppoooiiiuuytttttr";
        String uniques2 = uniques(str2);
        System.out.println(uniques2);


    }



        /*
        for (int i = 0; i <= str.length() -1; i++){
            char ch = str.charAt(i); // for getting every single character
            int count =   frequency(str, ch); // frequency
            if (count ==1){ // unique
                uniques+= ch ;
            }
        }
*/




    public static int frequency(String str, char ch) { // finds the frequency of char from string
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }

        return count;

    }


    public static String uniques(String str){
        String uniques = ""; //"bd"

        for (char each : str.toCharArray()){
            int count = frequency(str,each); // frequency of every character
            if (count ==1){
                uniques += each;
            }
        }
        return uniques;
    }





}