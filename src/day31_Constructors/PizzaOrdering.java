package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza small = new Pizza('S', 2, 3);
            Pizza medium = new Pizza('M', 2, 3);
            Pizza large = new Pizza('L', 3, 4);
            pizzas.addAll(Arrays.asList(small, medium, large));


        }

        System.out.println("Total number of pizzas: " + pizzas.size());
        double totalPrice = 0;

        for (Pizza each : pizzas) {
            totalPrice += each.calcCost();
        }
        System.out.println("Total Price: $" + totalPrice);
    }


}
