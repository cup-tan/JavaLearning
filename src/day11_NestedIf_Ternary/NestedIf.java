package day11_NestedIf_Ternary;
/*
grade: int score =
	90 ~ 100 ==> A
	80 ~ 89 ==> B
	70 ~ 79 ==> C
	60 ~ 69 ==> D
	otherwise ==> Invalid
 */
public class NestedIf {

    public static void main(String[] args) {
        int score = 45;
        String result = "";

        if(score >= 0 && score <= 100){ // if we give opposite of this condition// pre condition
            // valid score (5 possible condition)

            if (score >= 90){
                result = "A";
            }else if (score >= 80) { //this condition will be false,if score is less than 80
                result = "B"; // if previous condition is false
            }else if (score >= 70){
                result = "C";
            }else if (score >=60){
                result = "D";
            }else{
                result = "F";
            }
            } else{ // invalid score
               result = "invalid";
        }
        System.out.println(result);

        System.out.println("===========================");
        /*
        precondition: minimum salary of 30k
             sub condition: minimum 2 years of job history

             1 monday
             2 tuesday
             3 wednesday
             ....
             7 sunday
             invalid ===> there is no such a day
       task03:
            write a program that can find the number of days in a months
            (MUST APPLY NESTED IF)
        */




















    }





}
