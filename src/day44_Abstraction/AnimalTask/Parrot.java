package day44_Abstraction.AnimalTask;

public final class Parrot extends Animal implements Playable, Flyable {


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chocolate");
    }

    @Override
    public void play() {

    }


    public void talk(){
    System.out.println(getName() + " is talking");

}


    @Override
    public void playful() {
        System.out.println(getName() + " is playing with humans");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
