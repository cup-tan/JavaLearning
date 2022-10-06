package day33_LocalDateTime;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Uniques {

    public static void main(String[] args) {

        int[] arr = {2,2,1,3,3,4,5,6};
 /*   int element = arr[0];// 2
        int count = 0;
        for (int b : arr){
            if (element == b){
               count++;
            }

        }
        */
      for (int element : arr) {
          int count = 0;
          for (int b : arr) {
              if (element == b) {
                  count++;
              }
          }
           if (count == 1) {
              System.out.print(element+" ");
          }
      }
        System.out.println("==========================");

      int[] n1 ={10,20,30,40,50,60,70,80,90,100,100,110};
        uniqueElements(n1);

        System.out.println("=================");
        String[] n2 ={"A","B","B"};
        uniqueElements(n2);


}

     public static void uniqueElements(int[] arr){
         for (int element : arr) {
             int count = 0;
             for (int b : arr) {
                 if (element == b) {
                     count++;
                 }
             }
             if (count == 1) {
                 System.out.print(element+" ");
             }
           }

         System.out.println();


}

     public static void uniqueElements(char[] arr){
        for (char element : arr) {
            int count = 0;
            for (char b : arr) {
                if (element == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element+" ");
            }
        }

        System.out.println();


    }

    public static void uniqueElements(String[] arr){
        for (String element : arr) {
            int count = 0;
            for (String b : arr) {
                if (element.equals(b)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element+" ");
            }
        }

        System.out.println();


    }
}
