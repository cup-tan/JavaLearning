package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 {

    public static void main(String[] args) {

        String[] arr = {"Ahmed", " Aalia", "Abzal","Ahmed", "Virginia", "Ahmed", "Ahmed"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr) );
        Iterator<String> it = names.iterator();

        while( it.hasNext() ) { //true means it access to object
            // false means no more element that can be iterated
           if (it.next().equals("Ahmed")){
               it.remove();
           }

        }


        System.out.println(names); // [ Aalia, Abzal, Virginia]

        System.out.println("============================================================");


        ArrayList<String> employee = new ArrayList<>(Arrays.asList(arr));

        for ( Iterator<String> i = employee.iterator(); i.hasNext();){
            String each = i.next();
            if (each.equals("Ahmed")){
                i.remove();
            }
        }
        System.out.println(employee); // [ Aalia, Abzal, Virginia]


        System.out.println("==========================================================");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        list.removeIf(p -> p.equals("Ahmed")); // internally uses iterator

        System.out.println(list); // [ Aalia, Abzal, Virginia]








    }
}
