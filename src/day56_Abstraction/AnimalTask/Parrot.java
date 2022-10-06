package day56_Abstraction.AnimalTask;

public class Parrot extends Animal implements Playable, Talkative,Flyable{


    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("parrot is sleeping");
    }

    @Override
    public void fly() {
        System.out.println(" parrot is flying");
    }

    @Override
    public void play() {
        System.out.println("parrot is playing");
    }

    @Override
    public void talk() {
        System.out.println("parrot is talking");
    }
}
