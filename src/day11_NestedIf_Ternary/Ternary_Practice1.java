package day11_NestedIf_Ternary;
// second task: " can vote" or " cannot vote"
// third task: write a program that can check if two numbers are equal or not.


    public class Ternary_Practice1 {

    public static void main(String[] args) {
        int age = 16;
        String citizen = "USA";

        String result = "";

        if ( age > 21 && citizen == "USA"){
            result = "Can vote";
        }else{
            result = "Can not vote";
        }
        System.out.println(result);




    }
}
