package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

/*
2. write a program that can find the frequency of character from a String
		                DO NOT use nested loop
		                "AABBCCDDEE"  ==> "ABCDE"
		                output: A2B2C2D2E2
 */
public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")){
            list.add(each);
        }
        System.out.println(list);

        String nonDub = Util.removeDup(str); // ABC  ths string not data structure     to avoid duplication

        for (String each : nonDub.split("")) { // each: A,A,A,B,B,C
            int count = Collections.frequency(list, each);
            System.out.println(each + count);
        }

    }

}
