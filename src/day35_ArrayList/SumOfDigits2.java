package day35_ArrayList;

public class SumOfDigits2 {

    public static void main(String[] args) {
          String str = "a1b2c3";
          int sum = 0;
          for ( char each : str.toCharArray() ){
              if (Character.isDigit(each)){
                  sum += Integer.parseInt(each +"");

              }
          }
        System.out.println(sum); // 6





    }

    /*
    Character: (wrapper class)
    isDigit(char):  verifies if the char is digit, returns boolean
    isLetter(char): verifies if the char is letter, returns boolean

     */

}
