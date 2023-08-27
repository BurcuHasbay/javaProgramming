package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1500;
        double lira = dollar * 18.82;
        double euro= dollar * 1.20;
        double jpy = dollar * 114.14;
        double pound = dollar * 0.83;

        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("dollar = " + dollar);
        System.out.println("pound = " + pound);
        System.out.println("jpy = " + jpy);


    }
}
