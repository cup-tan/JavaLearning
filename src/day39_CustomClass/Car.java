package day39_CustomClass;

public class Car {


      /*
      Attributes:
            model, brand, year, color, mileage, price...// INSTANCE VARIABLE

       */


        String model;
        String brand;
        int year;
        String color;
        double mileage;
        double price;

        //instance variables

        // this is custom class of car. those are attribute (model ,brand,,,)
// instance means its belong to the this object


        public void start(){ // instance method, when i called first object . each of object that has its own copy
                System.out.println(brand+" "+model+" is started");
        }


        //2012 Toyota Corolla, Red, 10000, $ 45000
        public void getCarInfo(){
                System.out.println(year +" "+brand+" "+model+", "+color+", "+mileage+", $"+price);
        }
        // prints the car info


        public void setCarInfo( String carBrand, String carModel, int carYear, String carColor, double carPrice, double carMileage) {
// main usage those parameter was: to get EXTRA INFORMATION
                // sets the info of the car objects


                brand = carBrand; // completed functionality of method
                model = carModel;
                year = carYear;
                color = carColor; // when we called this method, we can use those information over than over again
                mileage = carMileage;
                price = carPrice;

          // instance method


        }











// we want each of the object that has its own copy for "public void " because there is no static
      /*
      car1: Toyota
      car2: BMW
      car3: Tesla
      */




    }

