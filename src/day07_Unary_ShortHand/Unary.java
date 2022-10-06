package day07_Unary_ShortHand;

public class Unary {
    public static void main(String[] args) {
        System.out.println( -1 + - 10); // -11

        System.out.println( -11 - -10); // -1


    /*  1. write a program that can verify if a number is positive, negative, 0

            Positive_Negative_0
            Ex:
                number = 120

            Output:
                120 is a positive number? true
                120 is negative number? false
                120 ii zero? false */

        int number = 120;

        boolean positiveNumber = number > 0;
        boolean negativeNumber = number < 0;
        boolean zero = number == 0;

        System.out.println( number + " is positive number: " + positiveNumber);
        System.out.println( number + " is negative number: " + negativeNumber);
        System.out.println( number + " is zero: " + zero);


     // --:


        int a = 20;
        a = a + 1;
        System.out.println(a);// 21 updated
        a = a - 1;
        System.out.println(a); //19
        --a;
        System.out.println(a);//19

        // ++

        int b = 10;
       // b = b+ 1; // b = 11;
       ++b;
       System.out.println(b);// 11

      // pre:
        int x = 100;
        System.out.println(++x);// 101

        int y = 200;
        System.out.println(--y);//199

        int z = 80;
        System.out.println(++z); // z = 81
        System.out.println(--z); // z = 80





    }
}
