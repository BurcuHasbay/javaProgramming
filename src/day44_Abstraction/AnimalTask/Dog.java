package day44_Abstraction.AnimalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super("Dog", breed, gender, age, size, color);
    }

    public void bark(){
    System.out.println(getName() + " is barking");
}


    @Override
    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }

    @Override
    public void play() {

    }


    @Override
    public void playful() {
        System.out.println(getName() + " is playing with balls");
    }
}
