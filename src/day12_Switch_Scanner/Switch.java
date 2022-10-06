package day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {

        switch (10){

            case 5:       //case value must be matching with switch value
                System.out.println("five");
                break;
            case 1:
                System.out.println("one");
                break;
            default:// only get executed non of the case
                System.out.println("invalid case");
                break;




        }



    }
}
