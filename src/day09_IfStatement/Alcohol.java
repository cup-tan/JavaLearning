package day09_IfStatement;
//write a java program that can identify if a person is eligible to buy alcohol

// ID and check age
public class Alcohol {

    public static void main(String[] args) {
        boolean hasID = true;
        int age = 26;

        boolean eligible = hasID && age >= 21;
        //                 true && false ===> false

        // we cannot execute two if conditions , only execute one which is true

        String result = "";
//    local variable
        if (eligible== true) {
           // System.out.println(" Eligible to buy alcohol");
         result = "Eligible to buy alcohol";
        }
        if (eligible == false){
          //  System.out.println("Go buy milk");
            result = " You are not old enough to buy alcohol";
        }
   // if is not true , it does not execute
        System.out.println(result);

















    }
}
