package day37_Inheritance.phoneTask;

public final class Nokia extends Phone{

    public Nokia(String model, double price, String size, String color) {
        super("Nokia" ,model, price, size, color);
    }

    public void selfOfDefense (){
        System.out.println("You can use " + brand + " " + model + " as self defense tool");
    }


}
