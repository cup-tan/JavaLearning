package day29_CostumMethods;

public class EligibilityToVote {

    /*
    age, citizen, name
     */

    public static void eligibleToBuyAlcohol(boolean hasID, int age){

        if (hasID && age >= 21){
            System.out.println("you are eligible to buy alcohol");
        }else{
            System.out.println("you are eligible to buy milk");
        }

    }

    public static void main(String[] args) {
        vote("John", 28,true, "Biden");
        vote("Daniel", 17, true,"Kanye");

        eligibleToBuyAlcohol(true, 19);

        calculator(100, '*',8);


    }


    public static void vote(String name, int age, boolean citizen, String candidateName){
        boolean eligibleToVote = age >= 18 && citizen == true;
        if (eligibleToVote){
            System.out.println(name+" is eligible to vote for "+candidateName);
        }else{
            System.out.println(name+" not eligible to vote");
        }

    }


    public static  void calculator(double num1,char operator,double num2){
        // +, -, *, /, %

        switch (operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;

            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;

            case '*':
                System.out.println("Multiplication: "+(num1+num2));
                break;

            case '/':
                System.out.println("division: "+(num1*num2));
                break;
            case'%':
                System.out.println("remainder: "+(num1%num2));
                break;

            default:
                System.out.println("Invalid Operator");

        }

    }




}
