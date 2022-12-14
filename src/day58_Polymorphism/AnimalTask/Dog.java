package day58_Polymorphism.AnimalTask;
/*
3. create subclass of Animal named Dog
            variable: dogName
            methods: bark, toString
 */

public class Dog extends Animal{

    public String dogName;

    public Dog( String dogName,int age, char gender) {
        super(age, gender);
        this.dogName = dogName;
    }

    public void bark(){
        System.out.println("Dog "+dogName+" is barking");
    }

    public void eat(){
        System.out.println("Dog "+dogName+" is eating");
    }

    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", gender=" + gender +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
