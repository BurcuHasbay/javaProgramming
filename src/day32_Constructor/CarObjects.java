package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Hyndai");
        Car car2 = new Car("Seat","Arona");
        Car car3 = new Car("Nissan","Juke",2013);
        Car car4 = new Car("Fiat","Egea",2022,800000);
        Car car5 = new Car("Chevrolet","Aveo",2010,40000,"White");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);







    }
}
