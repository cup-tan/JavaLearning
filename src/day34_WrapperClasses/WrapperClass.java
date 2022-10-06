package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {

        Integer num = 100; // only assign its own value
        int a = 100;

        byte t = 100;
        int z = t;

        Byte b1 = 50;
        int n1 = b1;

        byte b2 = 40;
       // Integer n2 = b2;   //Integer dedicate int only // adanmis, atanmis

        Integer n3 = new Integer(123); // object

        double[] arr = new double[3];//[0.0, 0.0, 0.0]

        System.out.println(Arrays.toString(arr));

        Double[] arr1 = new Double[3]; // wrapper class
        System.out.println(Arrays.toString(arr1));// default value is [null, null, null]


        int p1 = 300;
        Integer p2 = p1; // Autoboxing is Automatically done

        Integer q1 = 500;
        int q2 = q1; // unboxing // it is also done implicitly ==> tam olarak tamamemen tamamiyla

     // Double r1 = 300; // wrapper class is only dedicated to its primitive
        Double r1 =300.0;
        double r2 = r1; // unboxing

        long l1 = 400;
        Long l2 = l1; // Auto-boxing // implicitly done

         Float f1 = 100.5f;
         Float f2 = f1;











    }
}
