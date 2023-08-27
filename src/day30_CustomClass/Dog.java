package day30_CustomClass;

public class Dog {

    //you don't create main methods for classes. We only use customClasses for creating objects, not for running

    public String name;
    public String breed;

    public int age;
    public char gender;
    public String size;
    public String color;

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    

    
    
    
    
}
