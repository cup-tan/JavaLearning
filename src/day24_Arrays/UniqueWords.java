package day24_Arrays;

public class UniqueWords {

    public static void main(String[] args) {

        // 2. write a program that can find the unique words from an array of string

        String[] words = {"C#", "C#","Java","Pyhton", "Pyhton","C++"};
        //                 0     1    2      3         4         5


        for (int j =0; j<=words.length-1;j++){

            String s = words[j];// "C#" this string occurred in array words
            int count =0; // to assign the frequency of s

            for (int i =0; i<=words.length-1; i++){

                String each = words[i]; // each is all the elemenst of the string
                if (s.equals(each)) {      //if each string equals s. string s occurred in this words array
                    count ++;
                }
            }

            if (count == 1){
                System.out.print(s+" ");
            }


        }









    }
}
