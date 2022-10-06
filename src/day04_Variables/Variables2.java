package day04_Variables;

import javax.jws.soap.SOAPBinding;

public class Variables2 {
    public static void main(String[] args) {

       char ch1 = 'A';  // numbers , letters   JAVA HAS  127 characters in computer  0-65.000
       char ch2 = 65;

       System.out.println(ch1);// single quote only single character
        System.out.println(ch2); // gives character

        char ch3 = 35000;
        System.out.println(ch3);

        // char ch4 = 66000  out of range char

        char ch5 = 45876;
        System.out.println(ch5);

        char ch6 = 56789;
        System.out.println(ch6);


        char c1 ='A';// 65
        char c2 ='B';// 66 = 131
        System.out.println(c1+c2);

        int result = c1+c2;
        System.out.println(result); // 131

        double d = c1+c2;
        System.out.println(d);

         int num1 = 'A';
        System.out.println(num1);
       // char and int we can use we can assign

        char c4 = 65+45;
        System.out.println(c4);

        char c5 ='z'; // declare char only one character and numbers until 0,  65.000

        char c7 = '1'; // character gives me : 49   character has number ASCII table
        System.out.println(c7);  // char : '1'

        System.out.println(c7 + 1);   // 50   apply additions
                    // 1   '1' +1 = 50

        int r1 = c7;
        System.out.println(r1);   // int :49

        System.out.println("==================================");

        char a1 = 'A';
        System.out.println(a1);
        int n1 = 'A' + 2;
        System.out.println(n1);

        char a2 = '@';
        char a3 = 64;
        System.out.println(a2);
        System.out.println(a3);

        System.out.println('@' + 2);   // gives number   :  66
        





        



        








    }
}
