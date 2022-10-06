package day34_WrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;

// will be able to use arrayList In this class

public class ArrayList_Intro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>(); // not support other primitives so we use wrapper class
        scores.add(95); // index 0   // takes int because Auto boxing is happening //  int assign wrapper class
        scores.add(100);// index 1
        scores.add(85); // index 2
        scores.add(75);//        3 // add is overloaded method
        scores.add(1,65); // [95, 65, 100, 85, 75]
        scores.add(5,55);

        System.out.println(scores); // [95, 100, 85]

        System.out.println(scores.get(2)); // 100       arrayList support Integer  // get arrayList Integer









        // all the wrapper classes are CLASS
        // when we print out the class , do we need to use toString because of converting??
        // toString : execute automatically
         //we don't. WHY?/?/?

      // BECAUSE toString method is automatically executed for every single classes
    }

}
