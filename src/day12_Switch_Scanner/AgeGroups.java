package day12_Switch_Scanner;


/*
 2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

                  age cannot be negative or greater than 150

                  NOTE: MUST APPLY NESTED IF
 */
public class AgeGroups {

    public static void main(String[] args) {
        int age = 167;

        String ageGroup = "";

       if (age >1 && age <= 150 ){ // pre condition
        /*  if (age < 21){
              ageGroup = "Teenager";
          }else if (age <= 55){
              ageGroup = "Adult";
          }else {
              ageGroup = "Senior";
          }*/

     ageGroup = (age < 21)? "teenager" : (age <= 55) ? "adult" : "senior";


       }else{
           ageGroup = "invalid";
       }
        System.out.println(ageGroup);





    }
}
