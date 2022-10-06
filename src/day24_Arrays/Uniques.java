package day24_Arrays;
/*
  1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
 */
public class Uniques {

    public static void main(String[] args) {

     String str = "aabccdeefgghijkl";
//                 "aabcc"
     String uniques = ""; //"b"

//applicable  not applicable indexOf
        for (int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);        // a  a  b  c  c         every single character
            int first = str.indexOf(ch);    // 0  0  2  3  3         b icin index 2  // 'a' icin first index number is 0 , last index number is 1.
            int last = str.lastIndexOf(ch); // 1  1  2  4  4        // yine ayni b icin index 2 ve so is unique

            if (first == last){
                uniques += ch;
            }

        }
        System.out.println(uniques);



    }
}
