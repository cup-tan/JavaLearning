package day54_Abstraction.CarsTask;

public class ParkingLot {

    public static void main(String[] args) {

      //  Car car1 = new Car() {} // we cannot create object because it(abstract class) is not concrete

        BMW bmw = new BMW(); // bmw class is concrete .Therefore we can create object of bmw class and we didn't create abstract
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();
        Jeep jeep = new Jeep();

        bmw.start();
        tesla.start();
        toyota.start();
        jeep.start();


    }

}
