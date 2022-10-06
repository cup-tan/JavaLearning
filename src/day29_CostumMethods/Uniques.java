package day29_CostumMethods;
/*
07/19/2020
Topic: Custom methods

package name: day29_CustomMethods
			  return keyword

warmup task:
    1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B

                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C

            MUST use for each loop
 */
public class Uniques {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C","D","E","F"};



        for (String a : arr){ // gets each of the elements // repeat it over and over again because string array has 4 elements to find a.
            //  String a = "A"; // compare every single element in arr string

            int count = 0;

            for (String each : arr){// gets the frequency of the element
                if (a.equals(each)){
                    count++;
                }
            }

            if (count ==1){ // unique
                System.out.println(a);
            }
        }






    }
}
