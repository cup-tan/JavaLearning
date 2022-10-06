package day62_maps;

import java.util.*;

/*
2. write a program that stores the unique characters from a string into a map

        Ex:
        	str = "abacbdeef";

        	output:
            	{c=1, d=1, f=1}
 */
public class UniqueCharacters {

    public static void main(String[] args) {
          String str = "abacbdeefgghijklmmnn";
     //   String str = "abacbdeef";
        Map< String , Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList( str.split("")  ); // returns array

        for ( String each : list){ // each: abacbdeef
            if (Collections.frequency(list, each) == 1){
                map.put(each,1);
            }
        }

        System.out.println(map); // {c=1, d=1, f=1}


        // verify that J is unique
        System.out.println(map.containsKey("j")); // true

















    }
}
