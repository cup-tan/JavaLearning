package day41_toString;

import java.util.ArrayList;

/*

    CatObjects class:
                  create 5 objects of Cat and store them into an array variable

                  print out the information of every single cat
                        (DO NOT USE getInfo method)
 */
public class CatObjects {

    public static void main(String[] args) {

        /*
                Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 2, 'F', "Black", "Persian");

        System.out.println( cat1 );

        System.out.println("======================================");
         */

        Cat[] catPark = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        catPark[0].setCatInfo("Maya",3,'F',"white","streetCat");
        catPark[1].setCatInfo("Minnos",1,'F',"black","british");
        catPark[2].setCatInfo("Cano",4,'M',"orange","scottish");
        catPark[3].setCatInfo("Simba",2,'M',"Brown","streetCat");
        catPark[4].setCatInfo("Puding",3,'F',"white","british");

        for (Cat each : catPark){
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
        ArrayList<Cat> femaleCats = new ArrayList<>();

      /*  for (Cat each : catPark){ // access the elements of the array
            if (each.gender == ('M')){
                maleCats.add(each);
            }else{
                femaleCats.add(each);
            }
        }
*/
        for (int i = 0; i <= catPark.length -1 ; i++){
            if(catPark[i].gender == ('M')){
                maleCats.add( catPark[i] );
            }else{
                femaleCats.add( catPark[i] );
            }
        }

        System.out.println("Number male catPark: "+maleCats.size());
        System.out.println("Number female catPark: "+femaleCats.size());

        System.out.println(femaleCats);
        System.out.println(maleCats);
    }
}
