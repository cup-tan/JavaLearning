package day25_Practices;

public class LongestString {
    public static void main(String[] args) {

        String[] arr = {"Anam","Nickolas", "Amir", "Nurmamet"};

        int maxLength = arr[0].length();//8

        for (String each : arr){       // to find max length        //has to match with array dataType
            if (each.length() > maxLength){
                maxLength = each.length(); // finding the max length
            }
        }


      for (String each : arr){             // find out how many string length has max length
          if (each.length() == maxLength){ // used it for that has the max length equals string element in the array
              System.out.println(each);
          }

      }





    }
}
