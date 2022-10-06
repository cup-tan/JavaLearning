package day19_ForLoop;
/*
 3. write a program that can calculate the sum of all the even numbers between 0 ~ 100

    4. write a program that can calculate the sum of all the odd numbers between 0 ~ 100
 */
public class SumOfEvenOdd {

    public static void main(String[] args) {

// 3. write a program that can calculate the sum of all the even numbers between 0 ~ 100
     // tasks 03:
        // 0 2 4 6 8 10 ....

        int sumOfEven = 0;

        /*sum += 2;
        sum += 4;
        ...
        */

     /*   for (int i = 0; i <= 100; i += 2){ // mathematical approach
             sumOfEven += i;    // loop adds them together  sum of all even numbers

        }
       */


        for ( int i = 0; i <= 100; i++){ // java approach
            if ( i % 2 == 0){
                sumOfEven += i;
            }

        }
        System.out.println(sumOfEven);

        System.out.println("==============================");


        // tasks04:
        // 1 3 5 7 9 .....99
       // 4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
        // first odd number is 1

        int sumOfOdd = 0; // temporary

        // i represent odd number therefore we add 2
      /*  for ( int i = 1; i <= 99; i += 2 ){
            sumOfOdd += i;
        }
    */

      for ( int i = 1; i <= 100; i++){

          if ( i % 2 != 0){
           // sumOfOdd = sumOfOdd + i; same thing
              sumOfOdd += i;
          }
      }

       System.out.print(sumOfOdd);

        System.out.println();














    }
}
