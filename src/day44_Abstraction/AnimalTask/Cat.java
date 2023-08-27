package day44_Abstraction.AnimalTask;

public final class Cat extends Animal implements Playable {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Çiğköfte");
    }

    @Override
    public void play() {

    }

    public void climb(){
    System.out.println(getName() + " is climbing trees");
}


    @Override
    public void playful() {
        System.out.println(getName() + " is playing with toy mouse");
    }
}
