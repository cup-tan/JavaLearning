package day08_LogicalOperators;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {


        int score = 500;

        if (score > 500) {
            System.out.println("wonderfull");
        } else if (score <= 500) {
            System.out.println("great");
        } else if (300 < score && score < 500) {
            System.out.println(" good");
        } else {
            System.out.println("failed");
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your shoe size ");
        int size = scan.nextInt();
        { }
//   6-12



    }
}