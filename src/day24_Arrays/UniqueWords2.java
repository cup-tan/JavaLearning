package day24_Arrays;

public class UniqueWords2 {

    public static void main(String[] args) {

        String[] words = {"C#", "C#","Java","Python", "Python","C++","Ruby"};
        //s string is accurate of this words array


        for (String each : words){
           // String s = each; // each is : elements of this array

          //  String s = words[0]; // bu we need to compare every single of words array
            int count =0;// how many times iterate "words array

            // b: every single elements of this arrays // like this "C#", "C#","Java"
            for (String b : words){// b : represents each elements in the array
                if (each.equals(b)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
        }




}
//ilk olarak check frequency of first element of the array and if it is equal ==1 it is unique