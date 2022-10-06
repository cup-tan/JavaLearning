package day43_Static;

public class static_VS_instance {


    static int staticVariable; // 1 copy
    int instanceVariable;     //  2 copies


    public static void main(String[] args) {


        static_VS_instance obj1 = new static_VS_instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;

        static_VS_instance obj2 = new static_VS_instance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable); // 100
        System.out.println(obj2.instanceVariable); // 200

        System.out.println("===================================");
        System.out.println(obj1.staticVariable); // 500 // changed to 400  .. because only one copy
        System.out.println(obj2.staticVariable); // 500 // changed to 400
        // those way are not preferred way
      // static variable -- Advantage we can call within the class Name
        //  instance variable -- we can call with the object name

                           // class           static variable
        System.out.println(static_VS_instance.staticVariable); // preferred this way in JAVA


    }


}
