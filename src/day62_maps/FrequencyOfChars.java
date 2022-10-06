package day62_maps;

import java.util.*;

/*
	FrequencyOfChars
	1. Write a program that stores the the character and frequency of each character from a String in to a Map

	    Ex:
	    	str = "aaabbbccb"

		    output:
		        {a=3, b=4, c=2}
 */
public class FrequencyOfChars {

    public static void main(String[] args) {


        String str = "aaabbbccb";  // 3ab4c2
//                                          // { a=3, b=4, c=2}
        Map<String, Integer> map = new LinkedHashMap<>(); //  I chose Linked HashMap because I don't wanna change any order

        List<String> list = Arrays.asList(str.split("")); // return array

        for (String each : list){
            int frequency = Collections.frequency(list, each);
            map.put(each ,frequency);
        }

        System.out.println(map); // {a=3, b=4, c=2}





    }

}
