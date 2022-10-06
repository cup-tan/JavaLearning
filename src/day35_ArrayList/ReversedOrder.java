package day35_ArrayList;

import java.util.ArrayList;

/*
 1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */
public class ReversedOrder {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();// if you add 1 element . size will be one . so originally adjusted
                  list.add(10);// 0           // autoBoxing
                  list.add(20);// 1
                  list.add(1, 30);// 2 // eger index 2 yoksa,
                                  // index 2 ye deger vermeden diger indexlere deger veremeyiz cannot skip indexes
                  list.add(40);// 3
                  list.add(50);// 4

        System.out.println(list); //[10, 30, 20, 40, 50]  // size is dynamic so size will be increase and decrease

        for (int i = list.size()-1; i >= 0 ; i--){
            System.out.print(list.get(i) + " "); // 50 40 20 30 10
        }








    }
}
