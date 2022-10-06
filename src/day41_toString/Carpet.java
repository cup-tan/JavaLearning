package day41_toString;
/*
 instance variables:
                    width, length, unitPrice, isPersian (boolean)

            instance methods:
                    customOrder(): sets the carpet' width, length, unit-price, & isPersian
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    getCarpetInfo(): should be able to display all the info of the carpet
                    including the total cost of the carpet as calculated by calcCost()

        total price of carpet= (width*length)*unit-price

        if the carpet is Persian  carpet that's came from Turkey, add 200$ to the totalPrice

 */

import java.text.DecimalFormat;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

      // parameter role is extra information to complete the task
    public void customOrder(double width, double length, double unitPrice, boolean isPersian){

        this.width = width; // which one is highlighted is instance variable when we use this keyword
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
       // instance        local















    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;//200 // i want use outside of the method is return type
        if (isPersian){
            totalPrice += 200;
        }
        // return (isPersian) ? totalPrice +200 : totalPrice; // it's ternary
        return totalPrice; // it has to match method name , "double"

    }

 /*
 carpet1
 carpet2
 carpet3 // each instance variable has its own variable
  */

    public void getCarpetInfo(){
       DecimalFormat df = new DecimalFormat("0.00");

       System.out.println("===========================");
       System.out.println("Width: " +width);
       System.out.println("Length: "+length);
       System.out.println("Persian Carpet: "+isPersian);
       System.out.println("TotalPrice: "+df.format( calcCost() ) );
       System.out.println("=============================");
   }

    public String toString(){ // eger void ise we cannot use in print , sout.print icin void olmamasi lazim
        return "Width: "+width+", length: "+length+", Persian: "+isPersian;
    }










}
