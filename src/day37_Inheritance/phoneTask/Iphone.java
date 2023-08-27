package day37_Inheritance.phoneTask;

public final class Iphone extends Phone {


    public Iphone(String model, double price, String size, String color) {
        super("Apple" ,model, price, size, color);
    }

    public final void faceTime (long phoneNumber){
        System.out.println(brand + " " + model + "is having a Face Time with phone number");

    }
public void faceTime (String email){
    System.out.println(brand + " " + model + " is having a Face Time with email");

    }


}
