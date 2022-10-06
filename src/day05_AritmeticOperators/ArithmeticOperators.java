package day05_AritmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println( 20 + 3 - 2 + 1);
        System.out.println( 20 * 3 );
        System.out.println( 2 + 3 -1 * 4 );
                    //      2 + 3 - 4

        System.out.println( 10/3 ); // int/int ===> int
        System.out.println( 10.0/3); // double/int ===> double

        System.out.println( 10/3.0 ); // int/double ===> double  precedence oncelikli
        System.out.println( 30 % 8 );
              //  30 / 8 = 3
              // remainder: 30 - (8 * 3) = 6
           //               30 - 24 = 6


        System.out.println( 99 % 4);
        // 99/4 = 24
        // remainder: 99 - ( 4*24)
        //            99 - 96 = 3

        double t = 10/3.0 ;
        System.out.println(t);

        double r = 10%2* 2;
        System.out.println(r);


    }
    }
