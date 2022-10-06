package day42_Static;

public class Circle {

    double radius;  // instance == every circle has its own radius
    double diameter;   // instance
    static double pi = 3.14;  // every single pi value is 3.14 , so static
    //  because we only need it one copy of this variable for all the objects

    public void setInfo(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }

    public String toString(){
        return "Radius: "+radius+"\nDiameter: "+diameter+"\nPI: "+pi+"\nArea: "+calcArea()+"\nPerimeter: "+calcPerimeter();
    }

}
