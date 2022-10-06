package day10_IfStatement;
/*
    1. write a program that can identify if the given character is Alphabetic

    2. write a program that can identify if the given character is Digit

    3. write a program that can identify if the given character is a special character
 */

public class Character_Identify {

    public static void main(String[] args) {
        char character = '@'; // this letter is upper case OR lower case
        // 65 <= character <= 90 UPPER CASE LETTER

         //          65 <= character <= 90 this way cannot use    || 97 <= character <= 122
        boolean isAlphabetic =(character >= 65 && character <= 90) || (character >= 97 && character <= 122 );
                   //          upper case letter    || lower case letter  // range
      //  48 <= CHARACTER <= 57
        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar =  isAlphabetic ==  false && isDigit == false;
//                             !isDigit && !isAlphabetic    exclamation mark

        String alphabet = ""; // replace either one of them
      //  System.out.println( alphabet); if statement not initialize , it gives you compile error when you printed it

        if (isAlphabetic){
           // System.out.println(character + " is Alphabetic");
            alphabet = character + " is Alphabetic";
        }else{ // or if(!isAlphabetic) opposite
            //System.out.println( character + " is not Alphabetic");
           alphabet = character + " is  not Alphabetic character";
        }

        System.out.println(alphabet);

        String digit = "";



        if(isDigit){
           digit = character +" is a digit";
        }else{
            digit = character +" is not digit";
        }
        System.out.println(digit);


        String specialCharacter = "";

        if (specialChar == true){
            specialCharacter = character + " is a special character";
        }else{
            specialCharacter = character + " is not a special character";
        }
        System.out.println(specialCharacter);



    }
}
