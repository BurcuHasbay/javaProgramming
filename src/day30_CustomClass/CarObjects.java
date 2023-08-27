package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setInfo("Hyundai","i20","White",2015,350000);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Toyota","Yaris","Red",2012,250000);
        System.out.println(car2);

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2));
        for (Car each:carList) {
            System.out.println(each.brand + " : "+each.price);

        }


    }




}
