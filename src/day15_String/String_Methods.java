package day15_String;

import java.util.Locale;

public class String_Methods {

    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             01234567
        // charAt(index);
      char ch1 =  name.charAt(0);
      char ch2 = name.charAt(5); //charAt method of the string

        System.out.println(ch1);//'C'
        System.out.println(ch2);//'t'

        //length() ==> int
         int l = name.length();
        System.out.println(l);

        //last index: length of String -1
        int lastIndexNumber = name.length() -1 ;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(Str)


             String schoolName = "Cybertek";// referencing
            schoolName = schoolName.concat(" School"); //"Cybertek School"

        System.out.println(schoolName);

        String r1 = "Cybertek" +123+'A' +true;
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");

        //toLowerCase():

        String name1 = "CYBERTEK SCHOOL";
             name1 =  name1.toLowerCase(); //"cybertek school"

        System.out.println(name1);

        //toUpperCase():

      String name2 = "muhtar";
      name2 = name2.toUpperCase();//"MUHTAR"
// name2 is representing to new object
        System.out.println(name2);
     // (CAN WE HAVE MORE TASKS).toLowerCase

     // trim():

        String p = "      Cybertek       School    ";
            p =  p.trim(); // "Cybertek School" // p ile p yi esitliyoruz ki yeni yazilan p yi yazdirabilelim yoksa eski p kalir



        System.out.println(p);




    }
}
