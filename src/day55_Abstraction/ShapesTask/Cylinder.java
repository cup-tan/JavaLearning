package day55_Abstraction.ShapesTask;
/*
4. create a sub class of shape called Cylinder
			attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume

			override the abstract methods

			add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume

			add a static block that can initialize the static variables of the cylinder

 */

import java.text.DecimalFormat;

public final class Cylinder extends Shape{ // we cannot inherit to other classes when we use final keyword
                                    // we need to override the method from the abstract super class . it's mandatory to override
      public double radius;
      public double height;

      public Cylinder(double radius, double height){
          if (radius <= 0 || height <= 0){
              throw new RuntimeException("Radius and Height of Cylinder cannot be negative or 0");
          }

          this.radius = radius;
          this.height = height;
          area = calculateArea();// calculate Area method returns us , so we initialize it
          perimeter = calculatePerimeter();
          volume = calculateVolume();
          name ="Cylinder";
          hasVolume = true;
      }



    @Override
    public double calculateArea() {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }



    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter)  +
                ", volume=" + df.format(volume) +
                '}';
    }
}
