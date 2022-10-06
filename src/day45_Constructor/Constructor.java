package day45_Constructor;

import com.sun.tools.internal.jxc.ap.Const;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {

    public Constructor(){
        System.out.println("No arg constructor");

    }

    public Constructor(int a){
        System.out.println("with int argument");
    }

    public Constructor(String a){
        System.out.println("String argument");
    }

    public Constructor(int a, int b){
        System.out.println("two int arguments");
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor("Muhtar");

        Constructor obj2 = new Constructor(3,5);

/*
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2 = new ArrayList<>(list1);
       // list2.addAll(list1);
        System.out.println(list2);// as many as constructor we want add
    }
*/





    }

}
