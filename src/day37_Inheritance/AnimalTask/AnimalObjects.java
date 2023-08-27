package day37_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Komutan Logard", "Bulldog", 'M', "Small", 3, "Brown and White");
        System.out.println(dog1);

        Cat cat1 =new Cat("Vitto","British",'F',"Small",1,"Grey");
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("Osman","Kakapo",'M',"Small",30,"Orange");
        System.out.println(parrot1);
    }
}
