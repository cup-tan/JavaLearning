package day12_Switch_Scanner;

public class Switch_Practice2 {

    public static void main(String[] args) {

        String productName ="Macbook";

        String result = "";
        switch(productName){
            case "Galaxy" :
                 result = "Samsung";
                 break;
            case "Iphone" :
                result = "Apple";
                break;
            default:
                result= "not phone";
            case "Macbook":
                result = "Apple";
                break;
        }
        System.out.println(result);



    }
}
