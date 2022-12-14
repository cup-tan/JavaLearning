package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.Iphone;
import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Dog;
import day58_Polymorphism.AnimalTask.Cat;

public class TypeCastings {

    public static void main(String[] args) {

        Dog dog1 = new Dog("A",2,'F');
        Cat cat1 = new Cat("Maya",3,'F');

        Animal animal = dog1; // done implicitly

        Animal animal2 = cat1; // converting sub type to super type, implicitly

        // WebDriver driver = new ChromeDriver();
        // driver = new FireFoxDriver();

        // ChromeDriver driver1 = new ChromeDriver();
        // WebDriver driver2 = driver1; // implicitly done, upcasting




        System.out.println("==========================================");
        int x = 100;
        byte y = (byte)x; // MUST be done manually


        Animal animal3 = new Dog("A", 2, 'F');
       //   animal3.bark();

        Dog dog2 = (Dog)animal3;
         dog2.bark();

         Animal animal4 = new Cat("A",3,'F');
         Dog dog3 = (Dog) animal4; // those are no IS A relation

        System.out.println("===========================================");

        Iphone phone1 = new Iphone("12","6",1200);
        Phone phone2 = phone1; // up casting, implicitly done

        Phone phone3 = new Samsung("S20","9",1100);
        Samsung phone4 =(Samsung)phone3; // manually, down casting

        Iphone phone5 = (Iphone)phone3;



    }
}
