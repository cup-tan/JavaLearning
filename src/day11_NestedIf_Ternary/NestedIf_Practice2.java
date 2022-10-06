package day11_NestedIf_Ternary;
/*
             1 monday
             2 tuesday
             3 wednesday
             ....
             7 sunday
             invalid ===> there is no such a day

 */
public class NestedIf_Practice2 {

    public static void main(String[] args) {
        int day = 9;
        boolean validNumber = day >= 1 && day <= 7;

        String result = "";
        if (validNumber) {
        /*
        if (validNumber){
            if (day == 7){
                result = " Sunday";
            }else if (day == 6){
                result = "Saturday";
            }else if ( day == 5){
                result = "Friday";
            }else if (day == 4){
                result = "thursday";
            }else if ( day == 3){
                result = "wednesday";
            }else if ( day == 2){
                result = "tuesday";
            }else{
                result = " Monday";
            }

        }else{
            result = "invalid";
        }
        System.out.println(result);
        */

            result = (day == 7) ? "Sunday" : (day == 6) ? "saturday" : (day == 5) ? " friday" : (day == 4) ? "thursday" :
                    (day == 3) ? " wednesday" : (day == 2) ? "tuesday" : "monday";
        } else {
            result = "invalid";

            System.out.println(result);


        }
    }
}
