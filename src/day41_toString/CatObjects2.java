package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {

    public static void main(String[] args) {



        Cat[] cats = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        cats[0].setCatInfo("Maya",3,'F',"white","streetCat");
        cats[1].setCatInfo("Minnos",1,'F',"black","british");
        cats[2].setCatInfo("Cano",4,'M',"orange","scottish");
        cats[3].setCatInfo("Simba",2,'M',"Brown","streetCat");
        cats[4].setCatInfo("Puding",3,'F',"white","british");

        for (Cat each : cats){
            System.out.println(each);
        }


        /*

                  ArrayList:
                        maleCats
                        femaleCats

                        first approach: apply loop ( both for each loop and for loop )
                        second approach: do not use loop
         */


        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(cats));
        maleCats.removeIf(p -> p.gender == 'F');


        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(cats));
        //femaleCats.removeAll(maleCats);
        femaleCats.removeIf( p -> p.gender =='M');

        System.out.println("Number male cats: "+maleCats.size());
        System.out.println("Number female cats: "+femaleCats.size());

    }
}
