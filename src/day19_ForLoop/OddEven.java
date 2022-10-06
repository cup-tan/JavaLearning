package day19_ForLoop;

import java.util.SortedMap;

/*
tasks:
    1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5

    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class OddEven {

    public static void main(String[] args) {
          // i: 1 3 5 7 9 11 .... 99

        for( int i = 1; i <= 99; i += 2 ){

           if(i % 3 == 0 && i % 5 == 0){
               System.out.print(i+" "); // 15 45 75    //print bir sonrakini yanina append yapiyor bu yuzden bos bir tane eklemeliyiz
           }
        }

        System.out.println();

        System.out.println("hello");


       for ( int i = 0; i <= 100; i++) {
           if (i % 2 != 0) {                // pre condition   pre: i Must be odd number
               if (i % 3 == 0 && i % 5 == 0) { // sub condition    sub: MUST be divisible by 3&5
                   System.out.print(i + " ");
               }

           }
       }
        System.out.println();
        System.out.println("======================================");

        //task02:
        //2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
        // i: 0 2 4 6 8 10 ... 100

        for(int i = 0; i <= 100; i += 2){
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.print( i+" ");
            }

        }

        System.out.println();


        for ( int i = 0 ; i <= 100; i++){

            if ( i % 2 == 0 ){ // pre: MUST be Even number
                if ( i % 3 ==0 && i % 5 == 0){ // the number MUST be divisible by 3&5
                    System.out.print (i + " ");
                }
            }


        }

        System.out.println();


















    }
}
