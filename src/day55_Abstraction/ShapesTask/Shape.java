package day55_Abstraction.ShapesTask;
/*
1. create an abstract class called Shape
			attributes:
				name(static), area, perimeter, hasVolume(static), volume

			abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
								return-types: double
 */

public abstract class Shape { // cannot create object, cannot be final

    public String name;
    public double area;
    public double perimeter;
    public boolean hasVolume;
    public double volume;

    public abstract double calculateArea(); // because we don't want to create implementation, such as println, so we add abstract
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();



}
