package day48_Inheritance.AnimalTask;

import day48_Inheritance.AnimalTask.Animal;

public class   Dog        extends      Animal  {
    //      sub(child)             super(parent)

    /*
    variables: 4 : name, age, size, gender, breed, lb
    methods: 5
     */

public Dog(String name, String size, int age, char gender,String breed, double lb) {
    setInfo(name,size,age,gender,breed,lb);
   }

    public void bark(){
        System.out.println(name+ " is barking");
    }




}
