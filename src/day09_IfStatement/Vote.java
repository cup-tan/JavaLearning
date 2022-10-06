package day09_IfStatement;

public class Vote {

    public static void main(String[] args) {
        int age = 15;
        boolean usCitizen = true;



        if (age > 18 && usCitizen){
            System.out.println(" Eligible to vote for Trump");
        }
        // if olmadan else statement olusmaz
        else{
            System.out.println(" Not eligible to vote for trump");
        }
        // it cannot execute both condition in the same time
        // only one condition







    }
}
