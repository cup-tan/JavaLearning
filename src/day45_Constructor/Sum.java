package day45_Constructor;
/*
Task:
	create a class called Sum

			object of the sum should be able to calculate:
							2 integers
							2 decimals
							3 integers
							3 decimals
 */
public class Sum {


    public Sum(int a, int b){
        System.out.println( a+" + "+b+" = "+(a+b) );

    }

    public Sum(double a, double b){
        System.out.println( a+" + "+b+" = "+(a+b) );
    }


    public Sum(int a, int b, int c){ // it has to have different parameter
        System.out.println( a + " + " + b + " + " + c + " = " + (a+b+c) );
    }


    public Sum(double a, double b, double c){
        System.out.println( a + " + " + b + " + " + c + " = " + (a+b+c) );
    }

    public static void main(String[] args) {
       new Sum(10,20); // this is object with new keyword
       new Sum(10.5, 20.5);

       new Sum((int)10.5, 30);// second constructor will get executed

       new Sum(10,20,30);
       new Sum(10.0,20.0,30.0);

    }


}
