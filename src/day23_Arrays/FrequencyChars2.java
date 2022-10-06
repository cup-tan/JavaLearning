package day23_Arrays;

public class FrequencyChars2 {

    public static void main(String[] args) {
        String str = "BBCCDD";
        String nonDub = ""; // BCD


        for (int i = 0; i <= str.length() - 1; i++) {

            String ch = "" + str.charAt(i); // B B C C D D

            if (nonDub.contains(ch)) {
                continue;
            } else {
                nonDub += ch;
            }

        }

        String expectedResult = ""; // "B2C2D2

        //str = "BBCCDD"    nonDub = "BCD"  ====> "B2C2D2"

        for (int j = 0; j <= nonDub.length() -1; j++){ // iterates the string nonDub

            char ch = nonDub.charAt(j); // B C D
            int count = 0; //2, 2, 2,

            for (int i = 0; i <= str.length()-1; i++){ // returns the frequency of each ch from string str

                if (str.charAt(i)== ch){
                    count++;
                }
            }
           expectedResult += ""+ch +count;
            System.out.println(expectedResult);
        }

    }

    }

