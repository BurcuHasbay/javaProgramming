package day37_Inheritance.phoneTask;

public class Phone {

    public String brand;
    public String model;
    public double price;
    public String size;
    public String color;
    public static boolean hasBattery ;

    public Phone(String brand, String model, double price, String size, String color){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
        this.color = color;
        hasBattery = true;
    }

public void call (long phoneNumber){
    System.out.println(brand + " is calling" + phoneNumber);
}
public void text(long phoneNumber){
    System.out.println(brand + "  is texting" + phoneNumber);
}

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $ " + price +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", has battery ='" + hasBattery+ '\'' +
                '}';
    }



}
