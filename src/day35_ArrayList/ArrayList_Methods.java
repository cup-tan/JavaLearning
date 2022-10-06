package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
               earlyBirdList.add("Ibrahim");
               earlyBirdList.add("Virginia");
               earlyBirdList.add("Ziiadin");
               earlyBirdList.add("Erfan");
               earlyBirdList.add("Aalia");
        System.out.println(earlyBirdList); // add method increase the size
        //[Ibrahim, Virginia, Ziiadin, Erfan, Aalia]

            //   earlyBirdList.add(2, "Aslan");

        earlyBirdList.set(2, "Aslan"); // update the element // only matching one/ replace all of them
        earlyBirdList.set(0, "lan");
        System.out.println(earlyBirdList);
        //[lan, Virginia, Aslan, Erfan, Aalia]



        earlyBirdList.clear();
        System.out.println(earlyBirdList); //  []
        System.out.println(earlyBirdList.size()); // 0


        System.out.println("==============================");

        //remove(int index of array list)

          ArrayList<Integer> list = new ArrayList<>();
           list.add(1); // 0
           list.add(2); // 1
           list.add(3);//  2
           list.add(4);//  3
           list.add(5);//  4

        System.out.println(list);// [1, 2, 3, 4, 5]
        System.out.println(list.size()); // 5

        list.remove(2);  // [1, 2, 4, 5]

        System.out.println(list);
        System.out.println("===================================");


        // remove(object / element)

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(1); // 0
        list2.add(2); // 1
        list2.add(3);//  2
        list2.add(4);//  3
        list2.add(5);//  4

      //  int a =1; // remove index number [1, 3, 4, 5]
        Integer a = 1; // element
        list2.remove(a);

        System.out.println(list2);// [2, 3, 4, 5]


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");  // 0
        list3.add("Lilia");//   1
        list3.add("Bulnet");//  2
        list3.add("Viorel");//  3
        list3.add("Musa");//    4

     //   list3.remove(2); it is not boolean . it will be object not index
       // System.out.println(list3); // [Hamit, Lilia, Viorel, Musa]

      list3.remove("bulnet"); // it is not matching any those element if we write it with lower case
        System.out.println(list3); // [Hamit, Lilia, Viorel, Musa]

        boolean r = list3.remove("bulnet");

        boolean r1 = list3.remove("Musa");
        System.out.println(r);  // false
        System.out.println(r1); // true

    }
}
