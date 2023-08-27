package day30_CustomClass;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();


        dog1.name = "Popo";
        dog1.breed = "Samoyed";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Big";
        dog1.color = "White";



        Dog dog2 = new Dog();
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);

    }
}
