package day39_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
      /*  car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.color = "White";
        car1.mileage = 20000;
        car1.price = 19000.50;
*/

        car1.setCarInfo("Toyota","Corolla", 2010,"Red",40000,15000);

        System.out.println( car1.brand);
        System.out.println( car1.model);
        System.out.println( car1.year);
        System.out.println( car1.color);

        System.out.println("===================================");

        Car car2 = new Car();
           /* car2.brand = "Mercedes";
            car2.model = "G 550";
            car2.year = 2000;
            car2.color = "Blue";
*/

        car2.setCarInfo("BMW","X5",2018,"Black",40000,15000);

        System.out.println( car2.brand ); // default values , null = it means you have not initialize instance variables of those objects
        System.out.println( car2.model );
        System.out.println( car2.year );
        System.out.println( car2.color );   // each object it has its own copy of instance variable

        System.out.println("=======================================");

        //2012 Toyota Corolla, Red, 10000, $ 45000

        Car car3 = new Car();
        car3.setCarInfo("Audi","A7",2017,"White",35000,32000);

        Car car4 = new Car();
        car4.setCarInfo("Jeep", "Wramgler", 1890,"Blue", 250000,17000);

        car3.getCarInfo();
        car4.getCarInfo();



    }
}
