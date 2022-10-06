package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {

        String str = "AABBCDDEF"; // arrayList Character
        String uniques = "";
                                                         // data stucture yapip sonra data collection i kullanabilecez
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));
                                                     //  for (char each : str.toCharArray())
      /*  for(String each : str.split("")) {  // every single character in this string
        //   list.add(each);
       }*/

        System.out.println(list); // [A, A, B, B, C, D, D]


        for (String each : list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
               uniques += each;
            }

        }

        System.out.println(uniques); // usable data uniques. so we can print out of for loop




    }
}
