package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12",100, "6.7 inches","White");

        Samsung samsung = new Samsung("Galaxy S19",1500, "6 inches","Black");

        Nokia nokia = new Nokia("Brick",500,"4 inches", "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("-----------------------------");

        iphone.call(911);
        iphone.text(12345613);
        iphone.faceTime(784522231);
        iphone.faceTime("gmail.com");

        System.out.println("----------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("----------------------------");

        nokia.call(911);
        nokia.text(345678422);
        nokia.selfOfDefense();

    }

}

