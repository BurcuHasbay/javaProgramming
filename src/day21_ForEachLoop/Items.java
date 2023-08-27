package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "Ipad", "Iphone 11 case"};
        Double[] prices = {99.99, 150.0, 9.99, 259.0, 439.50, 39.99};
        int[] ItemsId = {12345, 12346, 12347, 12348, 12349, 12340};


        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            Double price = prices[i];
            int Id = ItemsId[i];

            System.out.println(item + " - " + Id + " - $"+price);
        }

    }
}
