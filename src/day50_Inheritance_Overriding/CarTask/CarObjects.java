package day50_Inheritance_Overriding.CarTask;

public class CarObjects {

    public static void main(String[] args) {

        Honda honda = new Honda();
        Mercedes mercedes = new Mercedes();
        Tesla tesla = new Tesla();
        Jeep jeep = new Jeep();


        honda.Start();
        System.out.println("==========================");
        mercedes.start();
        System.out.println("==========================");
        tesla.Start();
        System.out.println("==========================");
        jeep.Start();






    }
}
