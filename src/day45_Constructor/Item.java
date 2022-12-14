package day45_Constructor;
/*
1. create a class called Item
                instance variables:
                    name, unitPrice, quantity

                add a constructor that can initialize the fields

                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

        create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
 */
public class Item {

    String name;
    double unitPrice;
    int quantity; // cannot be decimal


    public Item (String name, double unitPrice, int quantity){ // constructor
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

    public double calcCost(){
        return unitPrice * quantity;
    }


    // to string benefits ; we don't need to call every single time , automatically print  with print statement
    public String toString(){
        return "Name: "+name+", Unit Price: "+unitPrice+", Quantity: "+quantity+", Total Price: $"+calcCost();
    }






}
