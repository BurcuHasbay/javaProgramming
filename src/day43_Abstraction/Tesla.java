package day43_Abstraction;

public final class Tesla extends Car{


    public Tesla(String brand, String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start() {
        System.out.println("Say\"Start\"");
    }


public void autoPilot(){
    System.out.println(getBrand()+ " " + getModel() + " has autoPilot");
}


}
