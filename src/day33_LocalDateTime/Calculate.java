package day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {
    /*
    Task01:
		1. create a method that can calculate the addition of two integers
		2. create a method that can calculate the addition of two decimals

		3. create a method that can calculate the multiplication of two integers
		4. create a method that can calculate the multiplication of two decimals
     */


    public static void main(String[] args) {


        int a = 10;// parameters are matching  with those data
        double b = 20;

        System.out.println(addition(a,(int)b));

        //casting float to the int

        float num1 = 10;
        float num2 = 9;

        System.out.println(addition((int)num1,(int) num2));//19

        System.out.println(addition(90, 5.5));//a can be assigned with int, b can be assigned with double

        System.out.println(addition(0.5,2));// the same with  method double, double

        int [] arr1 = {4,3,2,1};
        Arrays.sort(arr1);// implementation // int parameter gets executed // matter is with parameter

        char[] arr2 ={'C', 'B', 'A'};
        Arrays.sort(arr2);

        //overloading makes easy to remember and readable, but not mandatory.


        long l1 =100;
        long l2 =200;

        System.out.println(multiplication((int)l1,(int)l2));
        //we should cast both of them, if we want to get executed to int

    }

    //1.

    public static int addition(int a, int b){ //return value is mandatory .int value is return type
        return a+b;
    }

    //return time is not mandotory for overloading method// it could be different return type that doesn't matter

    public static double addition(double a, double b){ // we cannot give the same parameters
        return a+b;
    }

    public static double addition(double a, int b){
        return a+b;
    }

    //  public and static are not mandatory

    public static int multiplication(int a, int b){
        return a*b;
    }
 public static double multiplication(double a, double b){
        return a*b;
 }

}
