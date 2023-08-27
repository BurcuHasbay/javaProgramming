package day37_Inheritance.phoneTask;

public final class Samsung extends Phone {

    public Samsung(String model, double price, String size, String color) {
        super("Samsung", model, price, size, color);
    }

public void freeze (){
    System.out.println(brand + " " + model + " is freezing");
}


}
