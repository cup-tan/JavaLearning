package day35_ArrayList;

import java.util.ArrayList;

/*

    3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};

                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class Combine2Arrays_List {

    public static void main(String[] args) {

        String[] group1 = {"Aalia", "Mohammed","Aslan", "Ernis"};
        String[] group2 = {"Zarina", "Mee", "Irina", "Virginia", "Ali", "Dawud"};

        ArrayList<String> studentsList = new ArrayList<>();
// if it is a class toString methods done automatically
        for (String each : group1){
            studentsList.add(each);
        }
        for (String each : group2){
            studentsList.add(each);
        }

        System.out.println(studentsList);
        // [Aalia, Mohammed, Aslan, Ernis, Zarina, Mee, Irina, Virginia, Ali, Dawud]
    }
}
