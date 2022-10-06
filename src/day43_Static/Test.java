package day43_Static;

import java.util.Arrays;

import static Library.Resources.a; // only imports static variable name
import static Library.Resources.*; // imports all class members from Resources

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticBlock3.num1);
        System.out.println(StaticBlock3.num2);
        System.out.println(StaticBlock3.num3);
// we cannot run main method
// we need to create static block

        System.out.println( Arrays.toString(Data.arr) );
        System.out.println(Data.list);


        System.out.println("=============================");

        System.out.println(a);


    }
}
