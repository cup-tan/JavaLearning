package day29_CostumMethods;

public class RemoveDuplicates {

    //10. write a method that can remove the duplicates from the string


    public static void main(String[] args) {
      String str = "ababababcccccdddddeeee";
                //abcde
        removeDup(str);
    }


    public static void removeDup(String str){ //"abab" // data structure . array collection map for each loop
        String nonDub = "";//"ab"

                           //  split [a,b,a,b]
        for(String each : str.split("")){
      //  for (int i = 0; i <= str.length()-1; i++){
       //     String each = "" + str.charAt(i);
            if (!nonDub.contains(each)){
                nonDub += each;
            }

        }
        System.out.println(nonDub);
    }
}
