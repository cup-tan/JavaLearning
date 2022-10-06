package day07_Unary_ShortHand;
/* Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year,
    print true if it's leap year, otherwise print false

        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;

        output:
            2020 is leap year: true

            Assume that any year that can be divisible by 4 is leap (artik yil)year


*/
public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        boolean result = year%4 == 0;
        System.out.println(result); // true
        // 2021 is a leap year: false

        System.out.println( "Year " + year + " is leap year: " +result);




    }
}
