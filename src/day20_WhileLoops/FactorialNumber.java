package day20_WhileLoops;

import java.util.Scanner;

/*

    2. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class FactorialNumber {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          int n = scan.nextInt();
         //double for larger numbers
          double result = 1; // 5 * 4 * 3 * 2 * 1      //multiply with any number , for not result 0. so we give value 1
        for ( int i = n; i >= 1; i--){
        //for (int i = 4; i >= 1; i -= 1 ){ // i: 5, 4, 3, 2, 1
            result *= i;
        }
        System.out.println(result);





    }
}
