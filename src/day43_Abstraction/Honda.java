package day43_Abstraction;

public class Honda extends Car{
    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }


    //  public abstract void method(); IT can not have abstract method here.Only be created in the body.

// I can only override here and it can only take place in the subclasses

public void star(){
    System.out.println("Twist the key to ignition");
}

// child class worries about details in the methods and also
    //responsible for completing the method.


    @Override
    public void stop() {
        super.stop();
    }

    public void start() {
        System.out.println(" ");
    }


}
