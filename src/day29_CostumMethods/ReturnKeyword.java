package day29_CostumMethods;

public class ReturnKeyword {


    //6. calculate the grade of the student based on the score

    public static void main(String[] args) {
        grade(101);

        System.out.println("Task Completed");// System.exit is exiting the entire system. it's not print this message
    }

    public static void grade(int score){
        if (score < 0 || score > 100){
            System.out.println("Invalid Score");
            return; // exits the grade method
        }
        char grade = (score >= 90)? 'A' :(score >= 80)? 'B': (score>=70)? 'C' :(score >= 60)? 'D' : 'F';
        System.out.println("Grade is: "+grade);

    }


    public static void eligibleToBuy(int age){
        if (age < 21){
            System.out.println("You are not eligible to buy ");
            return;
        }
        System.out.println("you are eligible to buy");
    }



}
