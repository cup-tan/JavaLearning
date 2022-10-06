package day11_NestedIf_Ternary;
/*
 task:
    1. write a java program that can convert(donusturme) numbers between 0 ~ 9 to words,
   if the number is greater than 9 or less than zero, out put should be "Invalid".//     11 conditions
   else: otherwise, other conditions are failed
 */
public class NumberToWords {

    public static void main(String[] args) {
        int number = 8;

        String result = ""; // temporary value

        if (number == 0) {
            result = "zero"; // assigned operator (=)
        } else if (number == 1) {
            result = "one";
        } else if (number == 2) {
            result = "two";
        } else if (number == 3) {
            result = "three";
        } else if (number == 4) {
            result = "four";
        } else if (number == 5) {
            result = "five";
        } else if (number == 6) {
            result = "six";
        } else if (number == 7) {
            result = "seven";
        } else if (number == 8) {
            result = "eight";
        } else if (number == 9) {
            result = "nine";
        } else {
            // else if ( number < 0 || number > 9){
            result = "invalid";
        } // after multi branch statement will be assigned print statement
        System.out.println(result);








    }
}
