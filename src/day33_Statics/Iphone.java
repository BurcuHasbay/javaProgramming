package day33_Statics;

public class Iphone {
    public static String brand = "Apple";
    public static String model;

    public static double price ;
    public static  String OS = "IOS";
    public String color;

    public String size;

    public static String madeIn = "China";
    public static boolean hasBattery = true;

    public static boolean hasFaceTime = true;

    public static void printModelAndPrice(){
        System.out.println(model + " : " + price);

    }


    public void Method1 (){
        System.out.println(model + " : " + price);
        System.out.println(OS);
    }

}
