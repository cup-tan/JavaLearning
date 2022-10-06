package day39_CustomClass;

public class Dog {

/*
Dog:
	instance variables: declare outside of the method
	       name, breed, size, age, color

	instance methods: action method is instance method
			setDogInfo, getDogInfo, eat, drink, sleep, ...
 */

    String name;                     // as many as we want , we can create object
    String breed;       // its object . 5 copies of this object breed ,if we want to create 5 object
    String size;
    int age;
    String color;
                            // arguments
    public void setDogInfo( String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        breed = dogBreed;    // we need to use  assigned operator
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;
    }
    // sets the info of the dog

    public void getDogInfo(){
        System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+" years old");
    }
    // prints the dog info

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void play(){
        System.out.println(name+ " is playing");
    }




    /*
    Dog:
       dog1: husky
       dog2: pitbull
       dog3: golden retriever
     */












}
