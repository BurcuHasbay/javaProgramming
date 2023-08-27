package day36_Inheritance.AnimalTask;

import day32_Constructor.Car;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Nessie", "Husky", 'F', "Small", 3, "Brown");
        dog.drink();
        dog.eat();
        dog.move();
        dog.bark();
        dog.sleep();


        Cat cat = new Cat();
        cat.setInfo("Vitto", "British", 'F', "Small", 1, "Grey");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        cat.meow();

        Tiger tiger = new Tiger();
        tiger.setInfo("Luna","Siberian",'M',"Big",5,"Black and white");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);


    }
}
