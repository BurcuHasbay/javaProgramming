package day43_Abstraction;

public class Audi extends Car{
    public Audi(String brand, String model, String color, int year, double price) {
        super( "Audi",model, color, year, price);
    }

    public void start() {
        System.out.println("Push the start button");
    }



    public void autoPark() {
        System.out.println(getBrand() + " " + getModel()+ " has auto park feature");
    }







}
