package day54_Abstraction.CarsTask;
/*
Ex2:
     Car: abstract
		start();
	BMW
		start(): push start button
	Tesla
		start(): voice control
	Toyota
		start(): Insert the key
	Jeep
		start(): jump start

		Access-Modifier    abstract     Return-type     methodName(Parameter)
            (none private)       MUST          MUST
 */
 public  abstract class Car { // cannot be final
    public Car(){

}
    public  abstract void start();

    }


    final class A{ // can be final

 }

   class B{

       public static void main(String[] args) {

           A obj1 = new A();
          // Car obj2 = new Car();
       }
   }


