package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
/*

Collections Class:
           Collections.sort():  static
           Collections.swap()
           Collections.frequency(): return to the specific element

           Collections.max()
           Collections.min()
           Collections.replaceAll()
static method bu yuzden we can call class name
 */
    public static void main(String[] args) {
//sort
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'O', 'P', 'D', 'A', 'C', 'B'));

        System.out.println(chars);// [R, S, O, P, D, A, C, B]

        Collections.sort(chars);
        System.out.println(chars); // [A, B, C, D, O, P, R, S]


//swap

       ArrayList<String> students = new ArrayList<>();
       students.addAll(Arrays.asList("Aslan", "Cristina", "Zeliha", "Iman", "Fatima", "Mohammad"));
//                                     0          1         2         3        4          5
                                //    1                                   4
        Collections.swap(students,students.indexOf("Cristina"), students.indexOf("Fatima"));

        System.out.println(students); // [Aslan, Fatima, Zeliha, Iman, Cristina, Mohammad]

        Collections.swap(students,1,4 );

        System.out.println(students);

        Collections.swap(students,0 , students.size()-1);
        System.out.println(students);

// frequency

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Coffee", "Coffee", "Egg", "Battery", "Battery", "Battery", "Battery"));

      int count =  Collections.frequency(items,"Battery"); // number of occurrence

        System.out.println(count); // 4


        ArrayList<String> unique = new ArrayList<>(); // firstly iterate the array list

        for (String each : items){
         int i =   Collections.frequency(items, each);// each is every single elements in this arrayList
            if (i == 1){
                unique.add(each);
            }
        }
        System.out.println(unique); // [Egg]


        ArrayList<String > unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p -> Collections.frequency(unique2,p) > 1);


        System.out.println(unique2); // [Egg]

// max:
// min:
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9, 89, 1000, 2000, 3000, 30, 40, -50, 1000, 1000, 1000, 1000));

       Integer max =  Collections.max(list);
       Integer min = Collections.min(list);

        System.out.println("max: " +max );
        System.out.println("min: "+ min );

// replaceAll:

        Collections.replaceAll(list,1000,100000);

        System.out.println(list);



    }
}
