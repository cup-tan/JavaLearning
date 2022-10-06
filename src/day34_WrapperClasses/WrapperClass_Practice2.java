package day34_WrapperClasses;

import java.util.Scanner;

public class WrapperClass_Practice2 {

    public static void main(String[] args) {

        int a = Integer.MAX_VALUE; // 2147483647

        System.out.println(a);

        byte b = Byte.MAX_VALUE; //127
        System.out.println(b);

        int a2 = Integer.MIN_VALUE; //-2147483648
        System.out.println(a2);

        System.out.println("=====================================");

        //find the max num

        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // -2147483648
        // if  i want to max number , it could be possible small less of integer

        int min = Integer.MAX_VALUE;// 2147483647

        for (int i = 1; i <= 5; i++){

            System.out.println("Enter a number");
            int n = scan.nextInt(); // 10, 15, 5, 12, 0;

            if (n > max ){
                max = n ; // assign the variable to the max
            }

            if (n < min ){
                min = n;
            }

        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
