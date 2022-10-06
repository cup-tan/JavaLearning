package day08_LogicalOperators;
/*write a program that can check if the the given number is odd or even number
                Ex:
                    num = 30

                output:
                    30 is even number

                    Odd_Even*/
public class Odd_Even {
    public static void main(String[] args) {


        int number = 100;

        boolean even = number / 2 == 0;
        boolean odd = !even; // either true or false

        // we cannot execute both of them / only one condition
        if ( even) {
            System.out.println( number + " is even number ");
        }
        // we have to put another if condition
        if ( odd) {
            System.out.println(number + " is odd number ");
        }





    }
}
