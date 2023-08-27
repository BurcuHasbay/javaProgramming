package day43_Abstraction;

public class CarShop {
    public static void main(String[] args) {

      //  Car car1 = new Car("Cydeo","29","Blue",2023,1000);

        // WE CANNOT CREATE OBJECT FROM AN ABSTRACT CLASS,ABSTRACT CLASS IS NOT CONCRETE

Honda Honda = new Honda("Honda","Çaki-Maki","Black",2018,7500);

Audi Audi = new Audi("Audi","Q7","White",2017,35000);

Tesla Tesla = new Tesla("Tesla","Model3","Gray",2021,17000);

        System.out.println(Honda);
        System.out.println(Audi);
        System.out.println(Tesla);
        System.out.println("---------------------");


        Honda.setColor("White");
        Audi.setColor("Blue");
        Tesla.setColor("Black");

        System.out.println(Honda);
        System.out.println(Audi);
        System.out.println(Tesla);




    }
}
