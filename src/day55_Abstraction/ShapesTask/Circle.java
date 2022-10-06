package day55_Abstraction.ShapesTask;
/*
	2. create a sub class of shape called Circle (meant to be subclass ONLY)
			attributes: radius, name(static), area, perimeter, hasVolume(static), volume

			override the abstract methods

			(if the shape does not have volume, return 0 for the volume)

			add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume

			add a static block that can initialize the static variables of the circle
 */

public final class Circle extends Shape {// regular class cannot include abstract class, so it gives error// abstract yazsak bile it goves logical error, so we have to use override method

    public double radius;

    /*
    6 variables:
         2 statics: name, hasVolume
         4 instance: radius, area, perimeter, volume
    */

    public Circle(double radius){
        if (radius <= 0){
            throw new RuntimeException("Radius of the circle cannot be negative or 0");
        }

        this.radius = radius;
               area = calculateArea(); // because we didn't create local variable
         perimeter  = calculatePerimeter();
             volume =  calculateVolume();
               name = "Circle";
          hasVolume = false;

    }


    @Override
    public double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
