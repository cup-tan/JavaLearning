package day46_ConstructorCalls;
/*
2. class name: Car
			instance variables:
					brand, model, year, price, color

			1st constructor: initialize the brand of the car
			2nd constructor: initialize the brand and model of the car
							(MUST apply constructor Call)
			3rd constructor: initialize the brand, model, year of the car
							(MUST apply constructor Call)
			4th constructor: initialize the brand, model, year, pric of the car
							(MUST apply constructor Call)
			5th Constructor: initialize all isntances of the car
							(MUST apply constructor Call)

			Instance methods:
				toString()
 */
public class Car {
    String brand;
    String model;
    String color;
    int year;
    double price;

    public Car(String brand){
        this.brand = brand;
    }

    public Car( String brand, String model){ // and also constructor kendini kapsamayacak kesisim kumesi gibi olmayacak
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, String color){
        this(brand,model);// we cannot call two constructor, so we call two instances, and they are were initialized
        this.color = color;
    }

    public Car(String brand, String model, String color, int year){
        this(brand, model, color);
        this.year = year;
    }

    public Car(String brand, String model, String color, int year, double price){
        this(brand, model, color, year);
        this.price = price;
    }


    public String toString(){
        return "Brand: "+brand+"\nModel: "+model+"\nYear: "+year+"\nColor: "+color+"\nPrice: "+price;
    }





}
