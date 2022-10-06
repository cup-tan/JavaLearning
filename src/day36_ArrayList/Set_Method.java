package day36_ArrayList;

import java.util.ArrayList;

public class Set_Method {
    /*
    	1. write a program that can set the last element of the Integer arrayList to zero
			ex:
				list = [1,2,3,4,5];
				output: [1,2,3,4,0];
     */


    public static void main(String[] args) {

//only array supports the primitive of data structures
        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(10); //0
                        list1.add(20); //0
                        list1.add(30);// 0
                        list1.add(40);// 0
                        list1.add(50);// 0
                        list1.add(60);


                        list1.set(list1.size()-1 , 0);
                    System.out.println(list1);

        System.out.println("=========================================");
/*
2. write a program that can multiply each odd number by 2
			ex:	list = [1,2,3,4,5];
				output: [2,2,6,4,10]
 */

//index number icin for loop, element icin for each loop

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            list2.add(i);
        }
        System.out.println(list2);
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

        for (int i = 0; i <= list2.size()-1; i++){// i: index number
        Integer each =  list2.get(i); //int unBoxing  //each element in the list        // returns us Integer in ArrayList

            if (each % 2 != 0){
                list2.set( i, each*2 );
            }else{
                list2.set( i ,each*3); // even numbers multiply by 3
            }
        }

        System.out.println(list2);
        //[2, 2, 6, 4, 10, 6, 14, 8, 18, 10, 22, 12, 26, 14, 30, 16, 34, 18, 38, 20]










    }


}
