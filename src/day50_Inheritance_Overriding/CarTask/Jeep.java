package day50_Inheritance_Overriding.CarTask;
/*
Jeep:
	start(): Call Mechanic
			 Oil Change
			 jump start
 */
public class Jeep  extends Car{

    public void Start() {
        System.out.println("Call Mechanic");
        System.out.println("Oil Change");
        System.out.println("jump start");

    }
}
