package day51_Exceptions.PetTask;

public class House {

    public static void main(String[] args) {

       Dog dog1 = new Dog("Maya", "Terrier", 'F',3,"Mix");

        System.out.println(dog1.name);

        System.out.println(dog1);

        Tiger tiger1 = new Tiger("tigger","cat",'M',5,"orange");

        tiger1.eat();
        tiger1.drink();
        System.out.println(tiger1);

    }
}
