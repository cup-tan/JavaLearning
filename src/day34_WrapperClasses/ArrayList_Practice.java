package day34_WrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();


        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }

        System.out.println(oddList);
        System.out.println();
        System.out.println(evenList); //ArrayList

        System.out.println("=====================================");

        ArrayList<String> groceryList = new ArrayList<>();
              groceryList.add("milk");
              groceryList.add("Apple");
              groceryList.add("Eggs");
              groceryList.add("Mango");
              groceryList.add("Ice Cream");
              for (int i = groceryList.size()-1; i >= 0; i--){
                  System.out.print(groceryList.get(i)+" ");
              }
        System.out.println();

              for (String each : groceryList){
                  System.out.print(each +" "); // milk Apple Eggs Mango Ice Cream
              }



    }
}
